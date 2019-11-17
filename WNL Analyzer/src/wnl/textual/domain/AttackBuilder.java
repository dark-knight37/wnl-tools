package wnl.textual.domain;

import java.util.Hashtable;
import java.util.List;

import wnl.textual.node.ASimpleAffbody;
import wnl.textual.node.ASimpleAttack;
import wnl.textual.node.Node;

public class AttackBuilder extends Attack {

	public AttackBuilder(String nm, Node nn) {
		super(nm, nn);
	}

	@Override
	public void build(Hashtable<String, SensorNetworkItem> globalmapping) {
		ASimpleAttack start = (ASimpleAttack) this.node;
		ASimpleAffbody body = (ASimpleAffbody) start.getAffbody();

		NumberExtractor floatExtractor = new NumberExtractor();
		start.getSuccess().apply(floatExtractor);
		this.successProbability = floatExtractor.getDouble();
		
		IdentifierExtractor extractor = new IdentifierExtractor();
    	body.apply(extractor);
    	List<String> componentNames = extractor.getValues();
    	for (String s: componentNames) {
    		Component c = (Component) globalmapping.get(s);
    		this.components.add(c);
    	}

		
	}


}
