package wnl.textual.domain;

import java.util.Hashtable;
import java.util.List;

import wnl.textual.node.ASimpleService;
import wnl.textual.node.Node;

public class MonitoringServiceBuilder extends MonitoringService {

	public MonitoringServiceBuilder(String nm, Node nn) {
		super(nm, nn);
	}

	@Override
	public void build(Hashtable<String, SensorNetworkItem> globalmapping) {
		ASimpleService start = (ASimpleService) this.node;
		
    	IdentifierExtractor extractor = new IdentifierExtractor();
    	start.getDetectbody().apply(extractor);
    	this.contaminants = extractor.getValues();
    	
    	extractor.reset();
    	start.getSbody().apply(extractor);
    	List<String> componentNames = extractor.getValues();
    	for (String s: componentNames) {
    		Component c = (Component) globalmapping.get(s);
    		this.used.add(c);
    	}
	}
}