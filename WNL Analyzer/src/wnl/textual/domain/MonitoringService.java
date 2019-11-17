package wnl.textual.domain;

import java.util.ArrayList;
import java.util.List;

import wnl.textual.node.Node;
import wnl.wnl2bn.Effect;

public abstract class MonitoringService extends SensorNetworkItem implements Effect {
	
	protected List<Component> used;
	
	protected List<String> contaminants;

	public MonitoringService(String nm, Node nn) {
		super(nm, nn);
		this.used = new ArrayList<Component>();
		this.contaminants = new ArrayList<String>();
	}
	
	public List<Component> getUsedComponents() {
		return this.used;
	}
	
	public List<String> getContaminants() {
		return this.contaminants;
	}

}