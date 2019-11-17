package wnl.textual.domain;

import java.util.Hashtable;
import java.util.List;

import wnl.textual.node.AComplexComponent;
import wnl.textual.node.Node;

public class ComplexComponentBuilder extends ComplexComponent {

	public ComplexComponentBuilder(String nm, Node nn) {
		super(nm, nn);
	}

	@Override
	public void build(Hashtable<String, SensorNetworkItem> dict) {
		AComplexComponent start = (AComplexComponent) node;

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
			MonitoringService m = (MonitoringService) dict.get(s);
			this.usedServices.add(m);
		}
		
		SubComponentExtractor subExtractor = new SubComponentExtractor();
		start.getComponents().apply(subExtractor);
		List<String> subComponentNames = subExtractor.getValues();
		for (String s: subComponentNames) {
			Component c = (Component) dict.get(s);
			this.subcomponents.add(c);
		}
	}
}