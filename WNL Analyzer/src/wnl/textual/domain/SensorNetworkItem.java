package wnl.textual.domain;

import wnl.textual.node.Node;

public abstract class SensorNetworkItem implements Buildable {

	protected String name;
	
	protected Node node;
	
	public SensorNetworkItem(String nm, Node nn) {
		this.name = nm;
		this.node = nn;
	}

	public String getName() {
		return this.name;
	}
}
