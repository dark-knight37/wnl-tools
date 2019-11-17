package wnl.wnl2bn;

import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import WNLML.Contaminant;
import WNLML.Pipe;
import WNLML.WNNode;
import WNLML.WaterNetwork;
import bn.analysis.distribution.Distribution;
import bn.model.Arc;
import bn.model.BayesianNetwork;
import bn.model.Variable;
import bn.model.table.CPD;
import bn.model.table.CPDFactory;
import formalism.utils.LabelGenerator;
import wnl.textual.domain.Attack;
import wnl.textual.domain.ComplexComponent;
import wnl.textual.domain.Component;
import wnl.textual.domain.MonitoringService;
import wnl.textual.domain.SensorNetwork;
import wnl.textual.domain.SimpleComponent;
import wnl.wnl2bn.utils.CPTUtils;
import wnl.wnl2bn.utils.Utils;

public class Wnl2Bn {
	
	private final String ko = "ko";
	private final String ok = "ok";
	
	private ComposedNetwork network;

	private BayesianNetwork out;	
	private CPTUtils bnu;
	private Hashtable<String,Variable> lookup;

	public Wnl2Bn(WaterNetwork mdl, SensorNetwork sn) {
		this.network = new ComposedNetwork(mdl,sn);
		this.out = new BayesianNetwork(LabelGenerator.generate("bn"));
		this.lookup = new Hashtable<String,Variable>();
		this.bnu = new CPTUtils(this.out);
	}
	
	public void setComponentCPT(Variable component, double failureProbability) {
		this.bnu.component(component, failureProbability);
	}
	
	public void setWNL(WaterNetwork mdl, SensorNetwork sn) {
		this.network = new ComposedNetwork(mdl,sn);
	}
	
	public ComposedNetwork getWNL() {
		return this.network;
	}

	public BayesianNetwork getBN() {
		return this.out;
	}

	public void clean() {
		this.out.clearMeasures();
	}
	
	public void reset() {
		this.out = new BayesianNetwork(LabelGenerator.generate("bn"));
		this.lookup = new Hashtable<String,Variable>();
		this.bnu = new CPTUtils(this.out);
	}

	public void translate() {
		// Modules structure
		this.attack(); // Containing also CPTs generation
		this.monitoring();
		this.transport();
		// Intermodule arcs
		this.attack2monitoring();
		this.attack2transport();
		this.transport2monitoring();		
		// CPTs
		this.componentCPTs();
		this.transportCPTs();
		this.monitorsCPTs();
	}

	private void monitorsCPTs() {
		List<MonitoringService> monitors = this.network.getMonitoringServices();
		for (MonitoringService m: monitors) {
	  		Variable monitor = this.lookup.get(m.toString());
			this.bnu.monitor(monitor);
		}
	}

	private void transportCPTs() {
		this.pipeCPTs();
		this.nodeCPTs();
	}

	private void pipeCPTs() {
		List<Pipe> pipes = this.network.getPhysicalPipes();
		for (Pipe p: pipes) {
			Variable pv = this.lookup.get(p.toString());
			WNNode src = p.getSource();
			double fanout = this.network.nodeFanOut(src);
			double relativeFlow = p.getFlowrate() / fanout;
			this.bnu.pipeCPT(pv,relativeFlow);
		}
	}

	private void componentCPTs() {
		List<Component> components = this.network.getLogicalComponents();
		for (Component c: components) {
	  		Variable component = this.lookup.get(c.toString());
	  		double failureProbability = 0;
			if (c instanceof SimpleComponent) {
				SimpleComponent sc = (SimpleComponent) c;
				failureProbability = sc.getFailureProb();
			}
			try {
				this.bnu.component(component, failureProbability);
			} catch (Exception e) {
				System.out.print(e.toString());
			}
		}
	}

	private void transport2monitoring() {
		List<MonitoringService> services = this.network.getMonitoringServices(); 
		for (MonitoringService m: services) {
	  		Variable to = this.lookup.get(m.toString());
			for (WNNode c: this.network.getMonitoredNodes(m)) {
		  		Variable from = this.lookup.get(c.toString());
				Arc t2m = new Arc(LabelGenerator.generate("a"),from,to);
				this.out.addArc(t2m);
			}
		}
	}

	private void attack2transport() {
		List<Contaminant> physicalAttacks = this.network.getContaminants(); 
		for (Contaminant a: physicalAttacks) {
	  		Variable from = this.lookup.get(a.toString());
			for (WNNode c: a.getAttacks()) {
		  		Variable to = this.lookup.get(c.toString());
				Arc a2t = new Arc(LabelGenerator.generate("a"),from,to);
				this.out.addArc(a2t);
			}
		}
	}

	private void attack2monitoring() {
		List<Attack> logicalAttacks = this.network.getLogicalAttacks(); 
		for (Attack a: logicalAttacks) {
	  		Variable from = this.lookup.get(a.toString());
			for (Component c: a.getAffectedComponents()) {
		  		Variable to = this.lookup.get(c.toString());
				Arc a2m = new Arc(LabelGenerator.generate("a"),from,to);
				this.out.addArc(a2m);
			}
		}
	}

	// Transport section
	private void transport() {
		this.nodes();
		this.pipes();
		this.pipes2nodes();
	}

	private void pipes2nodes() {
		List<Pipe> pipes = this.network.getPhysicalPipes();
		for (Pipe p: pipes) {
			Variable pv = this.lookup.get(p.toString());

			WNNode src = p.getSource();
			Variable srcVariable = this.lookup.get(src.toString());
			Arc pa1 = new Arc(LabelGenerator.generate("a"),srcVariable,pv);
			this.out.addArc(pa1);

			WNNode dst = p.getDestination();
			Variable dstVariable = this.lookup.get(dst.toString());
			Arc pa2 = new Arc(LabelGenerator.generate("a"),pv,dstVariable);
			this.out.addArc(pa2);
		}
	}

	private void pipes() {
		List<Pipe> pipes = this.network.getPhysicalPipes();
		for (Pipe p: pipes) {
			Variable pv = this.bnu.variableFactory("pipe","_pipe_" + p.getId());
			this.lookup.put(p.toString(),pv);
		}
	}

	private void nodes() {
		List<WNNode> nodes = this.network.getPhysicalNodes();
		for (WNNode n: nodes) {
			Variable nv = this.bnu.variableFactory("node","_node_" + n.getName());
			this.lookup.put(n.toString(),nv);
		}
	}

	// Attack translation section
	private void attack() {
		this.physicalAttackTranslation();
		this.logicalAttackTranslation();
	}

	private void logicalAttackTranslation() {
		List<Attack> logicalAttacks = this.network.getLogicalAttacks(); 
		for (Attack a: logicalAttacks) {
			double prob = a.getSuccessProb();
	  		Variable cv = this.bnu.variableFactory("attack","_attack_" + a.getName());
	  		this.lookup.put(a.toString(),cv);
	  		this.bnu.leafCPT(cv,prob);
		}
	}

	private void physicalAttackTranslation() {
		List<Contaminant> physicalAttacks = this.network.getPhysicalAttacks();
		for (Contaminant c: physicalAttacks) {
			double prob = c.getSuccessProb();
	  		Variable cv = this.bnu.variableFactory("contaminant","_contam_" + c.getName());
	  		this.lookup.put(c.toString(),cv);
	  		this.bnu.leafCPT(cv,prob);
		}
	}
	
	// Monitoring translation
	private void monitoring() {
		this.services();
		this.components();
		this.componentUsedByService();
		this.serviceUsedByComponent();
		this.subcomponents();
	}
	
	private void subcomponents() {
		List<Component> components = this.network.getLogicalComponents();
		for (Component c: components) {
	  		Variable to = this.lookup.get(c.toString());
			if (c instanceof ComplexComponent) {
				ComplexComponent cc = (ComplexComponent) c;
		  		for (Component sub: cc.getSubComponents()) {
		  			Variable from = this.lookup.get(sub.toString());
		  			Arc sc = new Arc(LabelGenerator.generate("a"),from,to);
				  	this.out.addArc(sc);	
		  		}
			}
		}
	}

	private void serviceUsedByComponent() {
		List<Component> components = this.network.getLogicalComponents();
		for (Component c: components) {
	  		Variable compVar = this.lookup.get(c.toString());
	  		for (MonitoringService m: c.getUsedServices()) {
	  			Variable servVar = this.lookup.get(m.toString());
		  		Arc sc = new Arc(LabelGenerator.generate("a"),servVar,compVar);
		  		this.out.addArc(sc);	
	  		}
		}
	}

	private void componentUsedByService() {
		List<MonitoringService> services = this.network.getMonitoringServices();
		for (MonitoringService m: services) {
	  		Variable to = this.lookup.get(m.toString());
	  		for (Component c: m.getUsedComponents()) {
		  		Variable from = this.lookup.get(c.toString());
		  		Arc cs = new Arc(LabelGenerator.generate("a"),from,to);
		  		this.out.addArc(cs);
	  		}
		}
	}

	private void services() {
		List<MonitoringService> services = this.network.getMonitoringServices();
		for (MonitoringService m: services) {
	  		Variable service = this.bnu.variableFactory("logservice","_logservice_" + m.getName());
	  		this.lookup.put(m.toString(),service);
		}
	}

	private void components() {
		List<Component> components = this.network.getLogicalComponents();
		for (Component c: components) {
	  		Variable component = this.bnu.variableFactory("logcomp","_logcomp_" + c.getName());
	  		this.lookup.put(c.toString(),component);
		}
	}

	// Analysis
	public void prognose(List<Cause> contaminants) {
  		Distribution d = new Distribution("prognosys");
  		// Target setting
  		List<WNNode> assets = this.network.getPhysicalNodes();
  		for (WNNode e: assets) {
  			Variable v = this.lookup.get(e.toString());
  			d.addMeasurable(v);
  		}
  		// Cause Setting
  		List<Cause> possibility = this.network.getCauses();
  		for (Cause c: possibility) {
  			Variable v = this.lookup.get(c.toString());
  			String name = c.getName();
  			boolean toConsider = false;
  			if (contaminants != null) {
  	  			int index = 0;
  	  			while ((toConsider == false) && (index < contaminants.size())) {
  	  				Cause candidate = contaminants.get(index);
  	  				toConsider = (candidate.getName().equals(name));
  	  				index++;
  	  			}
  			}
  			String setval = toConsider ? this.ko : this.ok;
  	  		d.add(v.getName(),setval);  			
  		}
  		this.out.add(d);
	}

	public void risk() {
  		Distribution d = new Distribution("risk");
  		// Target setting
  		List<WNNode> assets = this.network.getPhysicalNodes();
  		for (WNNode e: assets) {
  			Variable v = this.lookup.get(e.toString());
  			d.addMeasurable(v);
  		}
  		this.out.add(d);
	}

	
	public void prognose() {
		List<Cause> all = this.network.getCauses();
		prognose(all);
	}

	public void diagnose(List<Effect> sensed) {
  		Distribution d = new Distribution("diagnosys");
  		List<Cause> causes = this.network.getCauses();
  		for (Cause c: causes) {
  			Variable v = this.lookup.get(c.toString());
  	  	  	d.addMeasurable(v);  			
  		}
  		List<Effect> possibility = this.network.getEffects();
  		for (Effect s: possibility) {
  			Variable v = this.lookup.get(s.toString());
  			String name = s.getName();
  			boolean toConsider = false;
  			int index = 0;
  			while ((toConsider == false) && (index < sensed.size())) {
  				Effect candidate = sensed.get(index);
  				toConsider = (candidate.getName().equals(name));
  				index++;
  			}
  			String setval = toConsider ? this.ko : this.ok;
  	  		d.add(v.getName(),setval);  			
  		}
  		this.out.add(d);
	}

	public void diagnose() {
		List<Effect> all = this.network.getEffects();
		diagnose(all);
	}

	public Variable traceElement(String name) {
		return this.lookup.get(name);
	}

//	private void infrastructure() {
//		// Translating nodes
//		EList<WNNode> nodes = this.network.getPhysicalNodes();
//		for (WNNode n: nodes) {
//			Variable nv = this.bnu.variableFactory("node","_node_" + n.getName());
//			this.lookup.put(n.toString(),nv);
//		}
//
//		// Translating pipes
//		EList<Pipe> pipes = this.network.getPhysicalPipes();
//		for (Pipe p: pipes) {
//			Variable pv = this.bnu.variableFactory("pipe","_pipe_" + p.getId());
//			this.lookup.put(p.toString(),pv);
//
//			WNNode src = p.getSource();
//			Variable srcVariable = this.lookup.get(src.toString());
//			Arc pa1 = new Arc(LabelGenerator.generate("a"),srcVariable,pv);
//			this.out.addArc(pa1);
//			WNNode dst = p.getDestination();
//			Variable dstVariable = this.lookup.get(dst.toString());
//			Arc pa2 = new Arc(LabelGenerator.generate("a"),pv,dstVariable);
//			this.out.addArc(pa2);
//			
//			double fanout = this.network.nodeFanOut(src);
//			double relativeFlow = p.getFlowrate() / fanout;
//			this.bnu.pipeCPT(pv,relativeFlow);
//		}
//	}
//
//
//
//	private void monitor() {
//		List<MonitoringService> sensors = this.network.getMonitoringServices();
//		for (MonitoringService s: sensors) {
//			// Variable and CPT
//	  		Variable sv = this.bnu.variableFactory("sensor","_sens_" + s.getName());
//	  		this.lookup.put(s.toString(),sv);
//	  		// Arcs to affected nodes
//	  		List<WNNode> monitoredNodes = this.network.getMonitoredNodes(s);
//	  		for (WNNode monitoredNode: monitoredNodes) {
//	  			String monitoredId = monitoredNode.getName();
//				Variable from = this.lookup.get(monitoredId);
//				Arc sa = new Arc(LabelGenerator.generate("a"),from,sv);
//				this.out.addArc(sa);
//		  		this.bnu.sensorCPT(sv);
//	  		}
//		}
//	}

//	private void asset() {
//		Vector<WNNode> eps = this.network.getAllAssets();
//		for (WNNode ep: eps) {
//			Variable assetVar = this.bnu.variableFactory("asset");
//			this.lookup.put(ep.toString(),assetVar);
//			Variable attachedVar = this.lookup.get(ep.toString());
//			Arc aa = new Arc(LabelGenerator.generate("a"),attachedVar,assetVar);
//			this.out.addArc(aa);
//			this.bnu.assetCPT(assetVar);
//		}
//	}

	private void nodeCPTs() {
		for (WNNode node: this.network.getPhysicalNodes()) {
			Variable v = this.lookup.get(node.toString()); 
			Vector<Variable> parents = this.out.getParents(v);
				String[] pnames = this.bnu.parentNames(parents);
				int plen = pnames.length;
				int rows = (int) Math.pow(2,plen);
				CPD cpt = CPDFactory.createCPD(v,this.out);
				for (int j=0; j<rows; j++) {
					String[] row = Utils.decode(j,plen);
					double pko = this.rowReasoner(row,pnames);
					cpt.setProbability(ok,1-pko,pnames,row);
			  		cpt.setProbability(ko,pko,pnames,row);
				}
		  		v.setDistribution(cpt);
		}
	}
	
	private double rowReasoner(String[] row, String[] pnames) {
		double retval = 1;
		int plen = pnames.length;
		if (plen == 0) {
			retval = 0;
		} else {
			boolean found = false;
			int i = 0;
			double kos = 0;
			double oks = 0;		
			while ((!found) && (i<plen)) {
				Variable v = this.out.getVariableByName(pnames[i]);
				if (v.hasLabel("sensor") || v.hasLabel("contaminant")) {
					if (row[i].equals(this.ko)) {
						found = true; 
					}
				} else {
					Pipe pp = this.getInversePipe(v);
					double tempFlow = pp.getFlowrate();
					if (row[i].equals(this.ko)) {
						kos += tempFlow;
					} else {
						oks += tempFlow;
					}
				}
				i++;
			}
			if (!found) {
				retval = kos / (kos + oks);
			}
		}
		return retval;
	}

//	private Node getInverseNode(Variable v) {
//		Node retval = null;
//		boolean found = false;
//		String nameToMatch = v.getName();
//		int i = 0;
//		while (!found) {
//			retval = this.in.getHasNode().get(i);
//			Variable temp = this.lookup.get(retval.toString());
//			found = temp.getName().equals(nameToMatch);
//			i++;
//		}	
//		return retval;
//	}
	private Pipe getInversePipe(Variable v) {
		Pipe retval = null;
		boolean found = false;
		String nameToMatch = v.getName();
		int i = 0;
		while (!found) {
			retval = this.network.getPhysicalPipes().get(i);
			Variable temp = this.lookup.get(retval.toString());
			found = temp.getName().equals(nameToMatch);
			i++;
		}	
		return retval;
	}
}