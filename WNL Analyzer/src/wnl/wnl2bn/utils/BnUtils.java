package wnl.wnl2bn.utils;

import java.util.Vector;

import bn.model.BayesianNetwork;
import bn.model.Variable;
import formalism.utils.LabelGenerator;

public class BnUtils {
	
	protected BayesianNetwork model;
	
	public BnUtils(BayesianNetwork bn) {
		this.model = bn;
	}

	public Variable variableFactory(String type) {
		return this.variableFactory(type,"");
	}
	
	public Variable variableFactory(String type, String dbg) {
		Variable retval = new Variable(LabelGenerator.generate("v") + dbg);
		retval.addLabel(type);
  		retval.add("ok");
  		retval.add("ko");
  		this.model.add(retval);
  		return retval;
	}

	public String[] parentNames(Vector<Variable> parents) {
		String[] retval = new String[parents.size()];
		for (int i=0; i<parents.size(); i++) {
			retval[i] = parents.get(i).getName();
		}
		return retval;
	}
}