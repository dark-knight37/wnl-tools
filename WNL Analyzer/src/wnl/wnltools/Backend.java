package wnl.wnltools;

import java.util.Hashtable;
import java.util.List;

import WNLML.WNNode;
import bn.model.BayesianNetwork;
import wnl.textual.domain.SimpleComponent;
import wnl.wnl2bn.Cause;
import wnl.wnl2bn.ComposedNetwork;
import wnl.wnl2bn.Effect;

public interface Backend {

	public BayesianNetwork translate();
	
	public ComposedNetwork getModel();
	
	public void prognose(List<Cause> causes) throws Exception;

	public void diagnose(List<Effect> effects) throws Exception;
	
	public Hashtable<String,Double> getVulnerability(WNNode endpoint);

	public Hashtable<String,Double> getLikelihood(Cause cause);

	public void sensitivity(Cause c, double actualFP) throws Exception;
}