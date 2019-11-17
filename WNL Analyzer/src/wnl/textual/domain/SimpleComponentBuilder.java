package wnl.textual.domain;

import java.util.Hashtable;
import java.util.List;

import wnl.textual.node.ASimpleComponent;
import wnl.textual.node.Node;

public class SimpleComponentBuilder extends SimpleComponent {

	public SimpleComponentBuilder(String nm, Node nn) {
		super(nm, nn);
	}

	@Override
	public void build(Hashtable<String, SensorNetworkItem> globalmapping) {
		ASimpleComponent start = (ASimpleComponent) node;

		NumberExtractor numExtractor = new NumberExtractor();
		start.getRedundancy().apply(numExtractor);
		this.redundancyLevel = numExtractor.getInt();
		
		numExtractor.reset();
		start.getReplication().apply(numExtractor);
		this.replicas = numExtractor.getInt();
		
		IdentifierExtractor idExtractor = new IdentifierExtractor();
		start.getUses().apply(idExtractor);
		List<String> usedServiceNames = idExtractor.getValues();
		for (String s: usedServiceNames) {
			MonitoringService m = (MonitoringService) globalmapping.get(s);
			this.usedServices.add(m);
		}

		numExtractor.reset();
		start.getFailure().apply(numExtractor);
		this.failureProb = numExtractor.getDouble();
	}
}