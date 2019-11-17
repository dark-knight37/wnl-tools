package wnl.wnl2bn.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import WNLML.WNLMLPackage;
import WNLML.WaterNetwork;

public class WnlDeserializer {

	public static String file2String(String pathfile){
		/*parsing of declarations*/
		String declarations = "";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(pathfile));
		 String line = null;
		 StringBuilder stringBuilder = new StringBuilder();
		 while( ( line = reader.readLine() ) != null ) {
		        stringBuilder.append(line);
		 }
		  declarations = stringBuilder.toString();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return declarations;
		
	}
	
	public static WaterNetwork string2Model(String modelString){
		WNLMLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("wnl", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		File modelFile = null;
		try {
			modelFile = new File("tmp.wnl");
			FileWriter fw = new FileWriter(modelFile);
			fw.write(modelString);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Resource resource = resSet.getResource(URI.createFileURI(modelFile.getPath()),true);
		WaterNetwork retval = (WaterNetwork) resource.getContents().get(0);
		return retval;
	}
	
	public static WaterNetwork file2Model(String filename) {
		String buffer = WnlDeserializer.file2String(filename);
		WaterNetwork retval = WnlDeserializer.string2Model(buffer);
		return retval;
	}
}