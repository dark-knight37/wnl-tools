package wnl.textual.domain;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import wnl.textual.analysis.DepthFirstAdapter;
import wnl.textual.node.AComplexComponent;
import wnl.textual.node.ASimpleAttack;
import wnl.textual.node.ASimpleComponent;
import wnl.textual.node.ASimpleService;
import wnl.textual.node.Start;

public class SensorNetwork extends DepthFirstAdapter {
	
	private Hashtable<String,SensorNetworkItem> dictionary;
	
	// Accessors methods
	// TODO: improve the DRY principle -- too much repeated code
	public List<MonitoringService> getMonitors() {
		List<MonitoringService> retval = new ArrayList<MonitoringService>();
		for (SensorNetworkItem s: this.getItems(MonitoringService.class)) {
			retval.add((MonitoringService) s);
		}
		return retval;
	}
	
	public MonitoringService getMonitor(String name) {
		MonitoringService retval = null;
		SensorNetworkItem lookup = this.dictionary.get(name);
		if (lookup != null) {
			if (MonitoringService.class.isAssignableFrom(lookup.getClass())) {
				retval = (MonitoringService) lookup; 
			}
		}
		return retval;
	}
	
	public List<Attack> getAttacks() {
		List<Attack> retval = new ArrayList<Attack>();
		for (SensorNetworkItem s: this.getItems(Attack.class)) {
			retval.add((Attack) s);
		}
		return retval;
	}
	
	public Attack getAttack(String name) {
		Attack retval = null;
		SensorNetworkItem lookup = this.dictionary.get(name);
		if (lookup != null) {
			if (Attack.class.isAssignableFrom(lookup.getClass())) {
				retval = (Attack) lookup; 
			}
		}
		return retval;
	}
	
	public List<Component> getComponents() {
		List<Component> retval = new ArrayList<Component>();
		for (SensorNetworkItem s: this.getItems(Component.class)) {
			retval.add((Component) s);
		}
		return retval;
	}
	
	public Component getComponent(String name) {
		Component retval = null;
		SensorNetworkItem lookup = this.dictionary.get(name);
		if (lookup != null) {
			if (Component.class.isAssignableFrom(lookup.getClass())) {
				retval = (Component) lookup; 
			}
		}
		return retval;
	}
	
	private List<SensorNetworkItem> getItems(Class<?> type) {
		List<SensorNetworkItem> retval = new ArrayList<SensorNetworkItem>();
		Enumeration<String> keys = this.dictionary.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			SensorNetworkItem temp = this.dictionary.get(key);
			if (type.isAssignableFrom(temp.getClass())) {
				retval.add(temp);
			}
		}
		return retval;
	}

	// Parsing functions	
    public void inStart(Start node) {
    	this.dictionary = new Hashtable<String,SensorNetworkItem>();
    }

    public void inASimpleService(ASimpleService node) {
    	IdentifierExtractor extractor = new IdentifierExtractor();
    	node.getSname().apply(extractor);
    	String name = extractor.getValue();
        MonitoringService monitor = new MonitoringServiceBuilder(name,node);
        this.dictionary.put(name,monitor);
    }

    public void inASimpleComponent(ASimpleComponent node) {
    	IdentifierExtractor extractor = new IdentifierExtractor();
    	node.getCname().apply(extractor);
    	String name = extractor.getValue();
        Component component = new SimpleComponentBuilder(name,node);
        this.dictionary.put(name,component);
    }
    
    public void inAComplexComponent(AComplexComponent node) {
    	IdentifierExtractor extractor = new IdentifierExtractor();
    	node.getCname().apply(extractor);
    	String name = extractor.getValue();
        Component component = new ComplexComponentBuilder(name,node);
        this.dictionary.put(name,component);
    }

    public void inASimpleAttack(ASimpleAttack node) {
    	IdentifierExtractor extractor = new IdentifierExtractor();
    	node.getAname().apply(extractor);
    	String name = extractor.getValue();
        Attack attack = new AttackBuilder(name,node);
        this.dictionary.put(name,attack);
    }
    
    public void outStart(Start node) {
    	Enumeration<String> keys = this.dictionary.keys();
    	while (keys.hasMoreElements()) {
    		String temporaryKey = keys.nextElement();
    		Buildable b = (Buildable) this.dictionary.get(temporaryKey); 
    		b.build(this.dictionary);
    	}
    }
    
    // Generation methods
    
    
}
