package wnl.wnltools;

import WNLML.WaterNetwork;
import wnl.wnl2bn.utils.WnlDeserializer;

public class PhysicalNetworkFactory {

	public static WaterNetwork generate(String filename) {
		WaterNetwork retval = WnlDeserializer.file2Model(filename);		
		return retval;
	}
}
