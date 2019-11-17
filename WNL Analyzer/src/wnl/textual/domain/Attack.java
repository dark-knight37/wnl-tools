package wnl.textual.domain;

import java.util.ArrayList;
import java.util.List;

import wnl.textual.node.Node;

public abstract class Attack extends SensorNetworkItem {
	
	protected double successProbability;
	
	protected List<Component> components;

	public Attack(String nm, Node nn) {
		super(nm, nn);
		this.components = new ArrayList<Component>();
		this.successProbability = 1.0;
	}

	public double getSuccessProb() {
		return this.successProbability;
	}
	
	public List<Component> getAffectedComponents() {
		return this.components;
	}
}