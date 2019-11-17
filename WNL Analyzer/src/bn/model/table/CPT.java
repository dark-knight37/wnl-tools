package bn.model.table;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import bn.model.BayesianNetwork;
import bn.model.Variable;
import formalism.core.Container;
import formalism.utils.Sorter;

public class CPT extends CPD {
	
	protected Hashtable<String,Row> table;
	
	public CPT() {
		super();
		this.table = new Hashtable<String, Row>();
	}
	
	public CPT(Variable v, BayesianNetwork bn) {
		super(v,bn);
		// Create the vector of the names of the parents
		Vector<String> namesOfParents = new Vector<String>();
		Vector<Variable> parents = bn.getParents(v);
		int numberOfParents = parents.size();
		for (Variable parent: parents) {
			namesOfParents.add(parent.getName());
		}
		namesOfParents.sort(null);
		// Create/initialize the support
		int spaceSize = bn.getParentSpaceSize(v);
		Vector<Entry> support = new Vector<Entry>();
		for (int index=0; index<spaceSize; index++) {
			support.add(index,new Entry());
		}
		// Fill the support
		int[] indices = new int[numberOfParents];
		int[] labelSize = new int[numberOfParents];
		for (int index=0; index<numberOfParents; index++) {
			indices[index] = 0;
			labelSize[index] = bn.getVariableByName(namesOfParents.get(index)).getValueNumber();
		}
		for (int index=0; index<spaceSize; index++) {
			for (int jndex=0; jndex<numberOfParents; jndex++) {
				String name = namesOfParents.elementAt(jndex);
				Variable parentVar = parents.elementAt(jndex);
				String label = parentVar.getValues().elementAt(indices[jndex]);
				EntryPoint ep = new EntryPoint(name,label);
				support.get(index).add(ep);
			}
			indices = this.incr(indices,labelSize);
		}
		// Fill the table
		this.table = new Hashtable<String, Row>();
		for (Entry e: support) {
			String tempEntry = e.stringvalue(); 
			this.table.put(tempEntry,new Row(v));
		}
	}
	
	private int[] incr(int[] indices, int[] labelSize) {
		int size = indices.length;
		int[] retval = new int[size];
		boolean stop = false;
		for (int i=size-1; i>=0; i--) {
			retval[i] = indices[i];
			if (stop == false) {
				retval[i]++;
				if (retval[i] == labelSize[i]) {
					retval[i] = 0;
				} else {
					stop = true;
				}
			}
		}
		return retval;
	}

	@Override
	public double getProbability(String value, Entry e) {
		return this.getRow(e).getProbability(value);
	}

	@Override
	public void setProbability(String value, double p, Entry e) {
		this.getRow(e).setProbability(value,p);
	}
	
	@Override
	public void setProbability(String value, double p, String[] pp, String[] ev) {
		String[] parents = Sorter.sort(pp);
		Entry e = new Entry();
		for (int i=0; i<ev.length; i++) {
			e.add(new EntryPoint(parents[i],ev[i]));
		}
		Row r = this.getRow(e); 
		r.setProbability(value,p);
	}

	private Row getRow(Entry e) {
		Row retval = null;
		Enumeration<String> keys = this.table.keys(); 
		while ((keys.hasMoreElements()) && (retval == null)) {
			 String temp = keys.nextElement();
			 String searching = e.stringvalue();
			 boolean match = temp.equals(searching);
			 if (match) {
				 retval = this.table.get(temp);
			 }
		}
		return retval; 
	}

	@Override
	protected String printParents(Container c) {
		BayesianNetwork bn = (BayesianNetwork) c; 
		Vector<Variable> parents = bn.getParents(this.owner);
		Vector<String> parentnames = new Vector<String>(); 
		for (Variable p: parents) {
			parentnames.add(p.getName());
		}
		parentnames.sort(null);
		String retval = "";
		for (String n: parentnames) {
			retval += " \"" + n + "\" "; 
		}
		return retval;
	}

	@Override
	protected String printTable(Container c) {
		String retval = "\ttable";
		//
		Enumeration<String> ks = this.table.keys();
		Vector<String> vks = new Vector<String>();
		while (ks.hasMoreElements()) {
			vks.add(ks.nextElement());
		}
		vks.sort(null);
		Vector<Row> rows = new Vector<Row>();
		for (int i=0; i<vks.size(); i++) {
			String vv = vks.elementAt(i);
			Row tmp = this.table.get(vv);
			rows.add(tmp);
		}
		int Isize = this.owner.getValueNumber();
		String[] values = new String[Isize];
		for (int p=0; p<Isize; p++) {
			values[p] = this.owner.getValue(p);
		}
		values = Sorter.sort(values);
		int Jsize = rows.size();
		double[][] m = new double[Isize][Jsize];
		for (int j = 0; j < Jsize; j++) {
			Row rr = rows.elementAt(j);
			for (int i = 0; i < Isize; i++) {
				m[i][j] = rr.getProbability(values[i]);
			}
		}
		for (int i = 0; i < Isize; i++) {
			for (int j = 0; j < Jsize; j++) {
				retval += " " + m[i][j] + " ";
			}
		}
		retval += ";\n";
		return retval;
	}

	@Override
	public Object clone(BayesianNetwork bn) {
		CPT retval = new CPT(this.owner,bn);
		for (int i=0; i<this.table.size(); i++) {
			String e = this.table.keys().nextElement();
			Row r = this.table.get(e);
			retval.table.put(e,(Row)r.clone());
		}
		return retval;
	}
}