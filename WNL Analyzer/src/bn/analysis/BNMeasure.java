package bn.analysis;

import java.util.Vector;

import external.javabayes.InferenceGraphs.InferenceGraph;
import external.javabayes.InferenceGraphs.InferenceGraphNode;
import formalism.analysis.DiscreteDistribution;
import formalism.analysis.MultipleMeasure;
import formalism.features.Measurable;

public abstract class BNMeasure extends MultipleMeasure {
	
	protected Vector<Observation> observations;
		
	public BNMeasure(String name) {
		super(name);
		this.observations = new Vector<Observation>();		
	}

	public BNMeasure(String name, Measurable m) {
		super(name,m);
		this.observations = new Vector<Observation>();		
	}
		
	public void add(String name, String value) {
		this.observations.add(new Observation(name,value));
	}
	
	public void add(Vector<Observation> localObs) {
		for (Observation o: localObs) {
			this.add(o);
		}
	}

	public void add(Observation o) {
		this.observations.add(o);
	}
	
	public Vector<String> getObservedNames() {
		Vector<String> retval = new Vector<String>();
		for (Observation o: this.observations) {
			retval.add(o.getVariable());
		}
		return retval;
	}
	
	public int getObservationSize() {
		return this.observations.size();
	}

	public String getValue(String variable) {
		String retval = null;
		boolean found = false;
		int index = 0;
		while ((!found) && (index<this.getObservationSize())) {
			Observation o = this.observations.get(index);
			if (o.getVariable().equals(variable)) {
				found = true;
				retval = o.getValue();
			}
		}
		return retval;
	}
	
	public Vector<DiscreteDistribution> compute(InferenceGraph graph) throws Exception {
		this.prepare(graph);
		Vector<DiscreteDistribution> retval = new Vector<DiscreteDistribution>();
		Vector<String> buffer = this.commit(graph);
		for (int i = 0; i < buffer.size(); i++) {
			String tempBuffer = buffer.get(i);
			String prefiltered = this.prefilter(tempBuffer);
			DiscreteDistribution filtered = this.infere(prefiltered);
			retval.add(filtered);
		}
		this.clear(graph);
		return retval;
	}

	
	private void prepare(InferenceGraph graph) {
		for (Observation o: this.observations) {
			String key = o.getVariable();
			String val = o.getValue();			 
			InferenceGraphNode obsNode = graph.get_node(key);
			obsNode.set_observation_value(val);
		}
	}  
	
	protected abstract Vector<String> commit(InferenceGraph graph) throws Exception; 
	
	protected abstract String prefilter(String input); 

	protected abstract DiscreteDistribution infere(String resultString);
	
	private void clear(InferenceGraph graph) {
		for (Observation o: this.observations) {
			String key = o.getVariable();
			InferenceGraphNode node = graph.get_node(key);
			node.clear_observation();
		}
	}
}