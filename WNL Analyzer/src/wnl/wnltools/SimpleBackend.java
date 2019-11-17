package wnl.wnltools;

import java.util.Hashtable;
import java.util.List;

import WNLML.WNNode;
import WNLML.WaterNetwork;
import bn.analysis.BNMeasure;
import bn.analysis.JavaBayesSolver;
import bn.model.BayesianNetwork;
import bn.model.Variable;
import bn.model.table.CPD;
import bn.model.table.CPT;
import bn.model.table.ConstantFunction;
import formalism.analysis.DiscreteDistribution;
import wnl.textual.domain.SensorNetwork;
import wnl.textual.domain.SimpleComponent;
import wnl.wnl2bn.Cause;
import wnl.wnl2bn.ComposedNetwork;
import wnl.wnl2bn.Effect;
import wnl.wnl2bn.Wnl2Bn;

public class SimpleBackend implements Backend {
	
	private Wnl2Bn transformation;
	
	public SimpleBackend(WaterNetwork model, SensorNetwork notation) {
		this.transformation = new Wnl2Bn(model,notation);
	}

	@Override
	public BayesianNetwork translate() {
		this.transformation.reset();
		this.transformation.translate();
		BayesianNetwork retval = this.transformation.getBN();
		return retval;
	}

	private void run() throws Exception {
  		JavaBayesSolver jbs = new JavaBayesSolver();
  		jbs.analyse(this.transformation.getBN());
	}

	private void setRun(String variableName, double value) throws Exception {
  		JavaBayesSolver jbs = new JavaBayesSolver();
  		BayesianNetwork bn = this.transformation.getBN();
  		Variable temp = bn.getVariableByName(variableName);
  		this.transformation.setComponentCPT(temp,value);
  		BayesianNetwork newBN = this.transformation.getBN();
  		//System.out.println(newBN.toSpecificFormat(null));
  		jbs.analyse(newBN);
	}

	private Hashtable<String,Double> getTable(String elemId) {
		Hashtable<String, Double> retval = null;
		BayesianNetwork mdl = this.transformation.getBN();
		Variable v = this.transformation.traceElement(elemId);
		String vname = v.getName();
		BNMeasure measure = (BNMeasure) mdl.getMeasure(0);
		int analysize = measure.size();
		boolean found = false;
		int i = 0;
		while ((!found) && (i<analysize)) {
			Variable temp = (Variable) measure.getMeasurable(i);
			if (temp.getName().equals(vname)) {
				found = true;				
				retval = ((DiscreteDistribution) measure.getResults(i)).dumpTable();
			}
			i++;
		}
		return retval; 
	}

	@Override
	public ComposedNetwork getModel() {
		return this.transformation.getWNL();
	}

	@Override
	public void prognose(List<Cause> causes) throws Exception {
		this.transformation.clean();
		this.transformation.prognose(causes);
		this.run();
	}

	@Override
	public void diagnose(List<Effect> effects) throws Exception {
		this.transformation.clean();
		this.transformation.diagnose(effects);
		this.run();
	}

	@Override
	public Hashtable<String,Double> getVulnerability(WNNode endpoint) {
		Hashtable<String,Double> retval = null;
		retval = this.getTable(endpoint.toString());		
		return retval;
	}

	@Override
	public Hashtable<String, Double> getLikelihood(Cause cause) {
		return this.getTable(cause.toString());
	}

	@Override
	public void sensitivity(Cause c, double actualFP) throws Exception {
		this.transformation.clean();
		this.transformation.risk();
		String vname = this.transformation.traceElement(c.toString()).getName();
		this.setRun(vname,actualFP);
	}
}