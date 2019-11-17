package bn.model;

import java.util.Hashtable;
import java.util.Vector;

import bn.model.table.CPD;
import formalism.core.Container;
import formalism.features.Analyzable;
import formalism.utils.LabelGenerator;

public class BayesianNetwork extends Container implements Analyzable {

	/**
	 * This is the container of the variables
	 */
	protected Vector<Variable> variables;
	
	/**
	 * This is the container of the arcs 
	 */
	protected Vector<Arc> arcs;
	
	/**
	 * This is the constructor given the name of the network 
	 * @param name
	 */
	public BayesianNetwork(String name) {
		super(name);
		this.variables = new Vector<Variable>();
		this.arcs = new Vector<Arc>();
	}
	
	/**
	 * Default constuctor 
	 */
	public BayesianNetwork() {
		super();
		this.variables = new Vector<Variable>();
		this.arcs = new Vector<Arc>();
	}

	public void add(Variable v) {
		this.variables.add(v);
	}
	
	public int getVariableNumber() {
		return this.variables.size();
	}
	
	public Variable getVariable(int index) {
		return this.variables.elementAt(index);
	}
	
	public Variable getVariableByName(String name) {
		Variable retval = null;
		int index = 0;
		int size = this.getVariableNumber();
		while ((retval == null) && (index < size)) {
			Variable temp = this.getVariable(index);
			if (temp.getName().equals(name)) {
				retval = temp;
			}
			index++;
		}
		return retval;
	}

	public void addArc(String name, Variable from, Variable to) {
		Arc a = new Arc(name,from,to);
		this.arcs.add(a);
	}

	public void add(String name, String from, String to) {
		Variable vFrom = this.getVariableByName(from);
		Variable vTo = this.getVariableByName(to);
		this.addArc(name, vFrom, vTo);
	}

	public void addArc(String from, String to) {
		Variable vFrom = this.getVariableByName(from);
		Variable vTo = this.getVariableByName(to);
		this.addArc(vFrom, vTo);
	}

	public void addArc(Variable from, Variable to) {
		String name = LabelGenerator.generate("a");
		this.addArc(name,from,to);
	}
	
	public int getArcNumber() {
		return this.arcs.size();
	} 
	
	public Arc getArc(int index) {
		return this.arcs.elementAt(index);
	}

	@Override
	public String toSpecificFormat(Container c) {
		String retval = "//Bayesian network\nnetwork \"" + this.getName() + "\" {\n}\n";
		Vector<CPD> cpds = new Vector<CPD>();
		for (Variable v: this.variables) {
			retval += v.toSpecificFormat(this);
			cpds.add(v.getDistribution());
		} 
		for (CPD cpt: cpds) {
			retval += cpt.toSpecificFormat(this);
		} 
		return retval;
	}

	public boolean cycleFree() {
		boolean retval = true;
		int index = 0;
		while ((index < this.variables.size()) && (retval == true)) {
			Vector<Variable> temp = new Vector<Variable>();
			Variable v = this.getVariable(index);
			retval = this.dft(v,temp);
			index++;
		}
		return retval; 
	} 

	private boolean dft(Variable v, Vector<Variable> temp) {
		boolean retval = !temp.contains(v);
		temp.add(v);
		Vector<Variable> childern = this.getChildern(v);
		int index = 0;
		while ((index < childern.size()) && (retval == true)) {
			retval = this.dft(childern.elementAt(index),temp);
			index++;
		}
		if (retval == true) {
			temp.remove(v);
		}
		return retval;
	}

	public Vector<Variable> getParents(Variable v) {
		Vector<Variable> retval = new Vector<Variable>();
		for (Arc a: this.arcs) {
			if (a.isIncomingTo(v)) {
				retval.add((Variable) a.getFrom());
			}
		}
		return retval;
	}

	public Vector<Variable> getChildern(Variable v) {
		Vector<Variable> retval = new Vector<Variable>();
		for (Arc a: this.arcs) {
			if (a.isOutgoingFrom(v)) {
				retval.add((Variable) a.getTo());
			}
		}
		return retval;
	}

	public int getParentSpaceSize(Variable v) {
		int retval = 1;
		Vector<Variable> ps = this.getParents(v);
		for (Variable p: ps) {
			retval *= p.getValueNumber(); 
		}
		return retval;
	}
	
	public Object clone() {
		BayesianNetwork retval = new BayesianNetwork(this.name);
		Hashtable<Variable,Variable> mapping = new Hashtable<Variable,Variable>();
		for (Variable x: this.variables) {
			Variable y = (Variable) x.clone(this);
			retval.add(x);
			mapping.put(x,y);
		}
		for (Arc i: this.arcs) {
			Arc j = new Arc(i.getName(),mapping.get(i.getFrom()),mapping.get(i.getTo()));
			retval.addArc(j);
		}
		return retval;
	}

	public void addArc(Arc a) {
		this.arcs.add(a);
	}

	public void clearMeasures() {
		this.measures.clear();
	}
}