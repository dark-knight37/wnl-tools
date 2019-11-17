package wnl.wnltools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import WNLML.WNNode;
import WNLML.WaterNetwork;
import bn.model.BayesianNetwork;
import wnl.textual.domain.SensorNetwork;
import wnl.wnl2bn.Cause;
import wnl.wnl2bn.ComposedNetwork;
import wnl.wnl2bn.Effect;
import wnl.wnl2bn.utils.CPTUtils;
import wnl.wnl2bn.utils.Utils;

public class WNLTools {
	
	public static void main(String[] args) {
		String filename = args[0];
		String inmodel = args[1];
		String csvfilename = args[2];
		Hashtable<String,String> report = new Hashtable<String,String>();
		Hashtable<String,String> temp = new Hashtable<String,String>();

		try {
			SensorNetwork sn = SensorNetworkFactory.generate(filename);
			WaterNetwork mdl = PhysicalNetworkFactory.generate(inmodel);
			Backend engine = new SimpleBackend(mdl, sn);
			BayesianNetwork generated = engine.translate();
			boolean cycle = generated.cycleFree();
			
			if (cycle == true) {
				// Distributed vulnerability due to single attacks
				temp = WNLTools.singleAttackDistributedVulnerability(engine);
				report.putAll(temp);

				// Distributed vulnerability due to double attacks
				temp = WNLTools.doubleAttackDistributedVulnerability(engine);
				report.putAll(temp);

				// Sensing
				temp = WNLTools.singleDiagnosys(engine);
				report.putAll(temp);

				// Parametric analysis
				temp = WNLTools.parametric(engine);
				report.putAll(temp);
				
				// Dump 
				Writer output = null;
		        File file = new File(csvfilename);
		        output = new BufferedWriter(new FileWriter(file));
		        Enumeration<String> keys = report.keys();
		        while (keys.hasMoreElements()) {
		        	String key = keys.nextElement();
		        	String payload = report.get(key).replaceAll("\\.",",");
			        output.write(key + "\n");			        
			        output.write(payload + "\n");
			        output.write("");
		        }
		        output.close();
			}
		} catch (Exception e) {
			System.out.println("Exception :(");
		}
		System.out.println("Have a nice day :)");
	}

	private static Hashtable<String,String> parametric(Backend engine) throws Exception {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		String keytrailer = "_PR";
		String header = "node;attack_prob;tested_prob;ok;ko;\n";
		ComposedNetwork mdl = engine.getModel();
		List<Cause> causes = mdl.getCauses();
		List<WNNode> physical = mdl.getPhysicalNodes();
		for (Cause c: causes) {
			double attackProb = c.getAttackProbability();
			String key = "ATT_" + c.getName() + keytrailer;
			String payload = header;
			for (int iteration = -4; iteration <= 4; iteration++) {
				double actualFP = CPTUtils.computeFP(attackProb,iteration);
				engine.sensitivity(c,actualFP);			
				for (WNNode node: physical) {
					payload += node.getName() + ";" + attackProb + ";" + actualFP + ";";
					Hashtable<String,Double> risk = engine.getVulnerability(node);
					String dump = Utils.debugCSV(risk);
					payload += dump + "\n";
				}
				retval.put(key,payload);
			}
		}
		return retval;
	}

	private static Hashtable<String,String> singleDiagnosys(Backend engine) throws Exception {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		String keytrailer = "_SD";
		String header = "attack;ok;ko;\n";
		ComposedNetwork mdl = engine.getModel();
		List<Cause> causes = mdl.getCauses();
		List<Effect> sensed = mdl.getEffects();
		for (Effect e: sensed) {
			String key = "SENS_" + e.getName() + keytrailer;
			String payload = header;
			List<Effect> underTest = new ArrayList<Effect>();
			underTest.add(e);
			engine.diagnose(underTest);
			for (Cause c: causes) {
				Hashtable<String,Double> diagnosys = engine.getLikelihood(c);
				String dump = Utils.debugCSV(diagnosys);
				payload += c.getName() + ';' + dump + "\n";
			}
			retval.put(key,payload);
		}
		return retval;
	}

	private static Hashtable<String,String> singleAttackDistributedVulnerability(Backend engine) throws Exception {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		String keyTrailer = "_DV/SA";
		String header = "node;ok;ko;\n";
		ComposedNetwork mdl = engine.getModel();
		List<WNNode> physical = mdl.getPhysicalNodes();
		List<Cause> causes = mdl.getCauses();
		for (Cause c: causes) {
			String key = "ATT_" + c.getName() + keyTrailer;
			String payload = header;
			List<Cause> underTest = new ArrayList<Cause>();
			underTest.add(c);
			engine.prognose(underTest);			
			for (WNNode node: physical) {
				Hashtable<String,Double> prognosys = engine.getVulnerability(node);
				String dump = Utils.debugCSV(prognosys);
				payload += node.getName() + ';' + dump + "\n";
			}
			retval.put(key,payload);
		}
		return retval;
	}

	private static Hashtable<String,String> doubleAttackDistributedVulnerability(Backend engine) throws Exception {
		Hashtable<String,String> retval = new Hashtable<String,String>(); 
		String keyTrailer = "_DV/DA";
		String header = "node;ok;ko;\n";
		ComposedNetwork mdl = engine.getModel();
		List<WNNode> physical = mdl.getPhysicalNodes();
		List<Cause> causes = mdl.getCauses();
		int size = causes.size();
		for (int i = 0; i < size; i++) {
			Cause c1 = causes.get(i);
			for (int j = i+1; j < size; j++) {
				Cause c2 = causes.get(j);
				String key = "ATT_" + c1.getName() + "_" + c2.getName() + keyTrailer;
				String payload = header;
				List<Cause> underTest = new ArrayList<Cause>();
				underTest.add(c1);
				underTest.add(c2);
				engine.prognose(underTest);			
				for (WNNode node: physical) {
					Hashtable<String,Double> prognosys = engine.getVulnerability(node);
					String dump = Utils.debugCSV(prognosys);
					payload += node.getName() + ';' + dump + "\n";
				}
				retval.put(key,payload);
			}
		}
		return retval;
	}
}