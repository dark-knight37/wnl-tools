package wnl.textual.domain;

import java.util.ArrayList;
import java.util.List;

import wnl.textual.node.Node;

public abstract class Component extends SensorNetworkItem {
	
	protected List<MonitoringService> usedServices;
	
	protected int redundancyLevel;
	
	protected int replicas;
	
	public Component(String nm, Node nn) {
		super(nm,nn);
		this.redundancyLevel = 1;
		this.replicas = 1;
		this.usedServices = new ArrayList<MonitoringService>();
	}
	
	public int getRedundancyLevel() {
		return this.redundancyLevel;
	}
	
	public int getReplicas() {
		return this.replicas;
	}
	
	public int getUsedServiceSize() {
		return this.usedServices.size();
	}
	
	public MonitoringService getUsedServiceAt(int i) {
		return this.usedServices.get(i);
	}
	
	public MonitoringService getUsedService(String name) {
		MonitoringService retval = null;
		int counter = 0;
		while ((retval == null) && (counter < this.usedServices.size())) {
			MonitoringService temp = this.getUsedServiceAt(counter);
			if (temp.getName().equals(name)) {
				retval = temp;
			}
			counter++;
		}
		return retval;
	}

	public List<MonitoringService> getUsedServices() {
		return this.usedServices;
	}
}