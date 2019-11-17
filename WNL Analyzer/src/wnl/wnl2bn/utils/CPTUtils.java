package wnl.wnl2bn.utils;

import java.util.ArrayList;
import java.util.List;

import bn.model.BayesianNetwork;
import bn.model.Variable;
import bn.model.table.CPD;
import bn.model.table.CPDFactory;

public class CPTUtils extends BnUtils {
	
	public CPTUtils(BayesianNetwork bn) {
		super(bn);
	}

	public void leafCPT(Variable v, double pko) {
		CPD cpd = CPDFactory.createCPD(v,this.model);
		cpd.setProbability("ok",1-pko,null);
		cpd.setProbability("ko",pko,null);
		v.setDistribution(cpd);
	}
	
	public void component(Variable v, double failureProb) {
		this.and(v,failureProb);
	}

	public void monitor(Variable v) {
		this.and(v,0);
	}
	
	private void and(Variable v, double failureProb) {
		CPD cpd = CPDFactory.createCPD(v,this.model);
		String[] parents = this.parentNames(this.model.getParents(v));
		int len = parents.length;
		// If every parent is ok, the node could fail with a failureProb probability
		String[] allOK = this.getConstantEvent("ok",len);
		cpd.setProbability("ok",1-failureProb,parents,allOK);
		cpd.setProbability("ko",failureProb,parents,allOK);
		// Otherwise is surely ok
		List<String[]> brokens = this.getAllExcept(allOK,len);
		for (String[] broken: brokens) {
			cpd.setProbability("ok",0,parents,broken);
			cpd.setProbability("ko",1,parents,broken);
		}
		v.setDistribution(cpd);
	}

	private String[] getConstantEvent(String string, int length) {
		String[] retval = new String[length];
		for (int i = 0; i < length; i++) {
			retval[i] = string;
		}
		return retval;
	}

	private List<String[]> getAllExcept(String[] exception, int length) {
		List<String[]> retval = new ArrayList<String[]>();
		for (int i = 0; i < Math.pow(2,length); i++) {
			String[] digest = Utils.decode(i,length);
			if (!this.equalDigests(digest,exception)) {
				retval.add(digest);
			}
		}
		return retval;
	}

	public void pipeCPT(Variable v, double flowRatio) {
		CPD cpt = CPDFactory.createCPD(v,this.model);
		String[] pp = this.parentNames(this.model.getParents(v));
		String[] ev0 = {"ok"};
		cpt.setProbability("ok",1,pp,ev0);
		cpt.setProbability("ko",0,pp,ev0);
		String[] ev1 = {"ko"};
		cpt.setProbability("ok",1-flowRatio,pp,ev1);
		cpt.setProbability("ko",flowRatio,pp,ev1);
		v.setDistribution(cpt);
	}
	
	public void assetCPT(Variable v) {
		this.pipeCPT(v,1);
	}

	public void sensorCPT(Variable v) {
		this.pipeCPT(v,1);
	}
	
	private boolean equalDigests(String[] a, String[] b) {
		boolean retval = true;
		int counter = 0;
		while ((retval == true) && (counter < a.length)) {
			retval = (a[counter].equals(b[counter]));
			counter++;
		}
		return retval;
	}

	public static double computeFP(double failureProb, int iteration) {
		double retval = failureProb;
		double factor = Math.pow(2,-1*Math.abs(iteration));
		if (iteration > 0) {
			retval = 1 - (1 - failureProb) * factor;
		} else if (iteration < 0) {
			retval = failureProb * factor;
		}
		return retval;
	}

}