package wnl.wnl2bn;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import WNLML.Contaminant;
import WNLML.Pipe;
import WNLML.WNNode;
import WNLML.WaterNetwork;
import wnl.textual.domain.Attack;
import wnl.textual.domain.Component;
import wnl.textual.domain.MonitoringService;
import wnl.textual.domain.SensorNetwork;
import wnl.textual.domain.SimpleComponent;

public class ComposedNetwork {
	
	private WaterNetwork physical;
	
	private SensorNetwork logical; 
	
	public ComposedNetwork(WaterNetwork m, SensorNetwork l) {
		this.physical = m;
		this.logical = l;
	}
	
	public List<Pipe> getOutPipes(WNNode n) {
		List<Pipe> pipes = this.physical.getContainsLink();
		pipes = pipes.stream().filter(p -> p.getSource() == n).collect(Collectors.toList());
		return pipes;
	}

	public List<Double> getFlowRateRatio(List<Double> in) {
		Vector<Double> retval = new Vector<Double>();
		double sum = this.sumAll(in); 
		for (int i=0; i<in.size(); i++) {
			retval.set(i, in.get(i)/sum);
		}
		return retval;
	}
	
	public List<Double> getAbsFlowRate(List<Pipe> pipes) {
		List<Double> retval = new Vector<Double>();
		for (Pipe p: pipes) {
			retval.add((double) p.getFlowrate());
		}
		return retval;
	}

	public double nodeFanOut(WNNode n) {
		List<Pipe> ps = this.getOutPipes(n);
		List<Double> ds = this.getAbsFlowRate(ps);
		return this.sumAll(ds);
	}
	
	public double sumAll(List<Double> v) {
		double sum = 0;
		for (Double d: v) {
			sum += d;
		}
		return sum;
	}

	public List<Double> getFlowRatio(WNNode n) {
		List<Pipe> ps = this.getOutPipes(n);
		List<Double> ds = this.getAbsFlowRate(ps);
		return this.getFlowRateRatio(ds);
	}
	
	public boolean isAsset(WNNode n) {
		return ((n != null) && (n.getDependReq().equals("")));
	}
	
	public Vector<WNNode> getAllAssets() {
		Vector<WNNode> all = new Vector<WNNode>(); 
		EList<WNNode> ell = this.physical.getContainsNode();
		for (WNNode e: ell) {
			if (e.getDependReq() != null) {
				all.add(e);
			}
		}
		return all;
	}

	public Vector<Contaminant> getContaminants() {
		Vector<Contaminant> all = new Vector<Contaminant>(); 
		EList<Contaminant> ell = this.physical.getContainsAttack();
		for (Contaminant c: ell) {
			all.add(c);		
		}
		return all;
	}

	public List<MonitoringService> getMonitoringServices() {
		return this.logical.getMonitors();
	}

	public List<WNNode> getMonitoredNodes(MonitoringService s) {		
		List<WNNode> retval = new ArrayList<WNNode>();
		for (WNNode w: this.physical.getContainsNode()) {
			String monitor = w.getMonitoringService();
			if (monitor != null) {
				if (monitor.equals(s.getName())) {
					retval.add(w);
				}
			}
		}
		return retval;
	}

	public List<Contaminant> getPhysicalAttacks() {
		return this.physical.getContainsAttack();
	}

	public List<Attack> getLogicalAttacks() {
		return this.logical.getAttacks();
	}

	public List<WNNode> getPhysicalNodes() {
		return this.physical.getContainsNode();
	}

	public List<Pipe> getPhysicalPipes() {
		return this.physical.getContainsLink();
	}

	public List<Component> getLogicalComponents() {
		return this.logical.getComponents();
	}

	public List<Cause> getCauses() {
		List<Cause> retval = new ArrayList<Cause>();
		for (Attack a: this.getLogicalAttacks()) {
			Cause temp = CauseFactory.generate(a);
			retval.add(temp);
		}
		for (Contaminant c: this.getPhysicalAttacks()) {
			Cause temp = CauseFactory.generate(c);
			retval.add(temp);
		}
		return retval;
	}

	public List<Effect> getEffects() {
		List<Effect> retval = new ArrayList<Effect>();
		List<WNNode> nodes = this.getPhysicalNodes();
		for (MonitoringService ms: this.getMonitoringServices()) {
			boolean found = false;
			int index = 0;
			while ((found == false) && (index < nodes.size())) {
				WNNode temp = nodes.get(index);
				String monitoringServiceName = temp.getMonitoringService();
				if (monitoringServiceName != null) {
					found = (monitoringServiceName.equals(ms.getName()));
				}
				index++;
			}
			if (found == true) {
				retval.add(ms);
			}
		}
		return retval;
	}

	public List<Cause> getPhysicalCauses() {
		List<Cause> retval = new ArrayList<Cause>();
		for (Contaminant c: this.getPhysicalAttacks()) {
			Cause temp = CauseFactory.generate(c);
			retval.add(temp);
		}
		return retval;
	}

	public List<SimpleComponent> getLogicalBasicComponents() {
		List<SimpleComponent> retval = new ArrayList<SimpleComponent>();
		List<Component> all = this.getLogicalComponents();
		for (Component c: all) {
			if (c instanceof SimpleComponent) {
				retval.add((SimpleComponent) c);
			}
		}
		return retval;
	}
}