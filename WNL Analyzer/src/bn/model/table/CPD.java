package bn.model.table;

import bn.model.BayesianNetwork;
import bn.model.Variable;
import formalism.core.Container;
import formalism.features.Printable;

public abstract class CPD implements Printable, Cloneable {
	
	protected Variable owner; 

	public CPD(Variable v, BayesianNetwork bn) {
		this.owner = v;
	}

	public CPD() {
		this.owner = null;
	}
	
	public void setOwner(Variable v) {
		this.owner = v;
	}
	
	public Variable getOwner() {
		return this.owner;
	}
	
	public abstract double getProbability(String value, Entry e);

	public abstract void setProbability(String value, double p, Entry e);
	
	public abstract void setProbability(String value, double p, String[] pp, String[] ev);

	@Override
	public String toSpecificFormat(Container c) {
		String retval = "probability (  ";
		retval += "\"" + this.owner.getName() + "\"";
		retval += this.printParents(c);
		retval += " ) {\n";
		retval += this.printTable(c);
		retval += "}\n";
		return retval;
	}

	protected abstract String printParents(Container c);

	protected abstract String printTable(Container c);
	
	public abstract Object clone(BayesianNetwork bn);
}