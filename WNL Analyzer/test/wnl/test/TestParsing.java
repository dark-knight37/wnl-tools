package wnl.test;

import WNLML.WaterNetwork;
import bn.model.BayesianNetwork;
import wnl.textual.domain.SensorNetwork;
import wnl.wnl2bn.utils.WnlDeserializer;
import wnl.wnltools.Backend;
import wnl.wnltools.SensorNetworkFactory;
import wnl.wnltools.SimpleBackend;

public class TestParsing {

	public static void main(String[] args) {
		try {
			String filename = args[0];
			SensorNetwork sn = SensorNetworkFactory.generate(filename);

			String inmodel = args[1];
			WaterNetwork mdl = WnlDeserializer.file2Model(inmodel);
			
			Backend engine = new SimpleBackend(mdl,sn);
			BayesianNetwork generated = engine.translate();
			
			
			System.out.println("Have a nice day :)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}