package formalism.analysis;

import java.util.Enumeration;
import java.util.Hashtable;

public class DiscreteDistribution implements Results {

	protected Hashtable<String,Double> distribution;
	
	public DiscreteDistribution() {
		this.distribution = new Hashtable<String, Double>();
	}
	
	@SuppressWarnings("unchecked")
	public DiscreteDistribution(Hashtable<String,Double> d) {
		this.distribution = (Hashtable<String, Double>) d.clone();
	}

	public DiscreteDistribution(String name) {
		this.distribution = new Hashtable<String, Double>();
	}
	
	public void add(String value, double probability) {
		this.distribution.put(value,probability);
	}
	
	public int size() {
		return this.distribution.size();
	}
	
	public String getKey(int i) {
		String retval = "";
		Enumeration<String> temp = this.getValues();
		for (int j=0; j<=i; j++) {
			retval = temp.nextElement();
		}
		return retval;
	}
	
	public Hashtable<String,Double> dumpTable() {
		return this.distribution;
	}

	public double getProbability(int i) {
		return this.getProbability(this.getKey(i));
	}

	public Enumeration<String> getValues() {
		return this.distribution.keys();
	}
	
	public double getProbability(String key) {
		Double dd = this.distribution.get(key); 
		double d = dd.doubleValue();
		return d;

	}
	
	public String toString() {
		String retval = "";
		for (int i=0; i<this.size(); i++) {
			String k = this.getKey(i);
			Double v = this.getProbability(k);
			retval += k + "=" + v.toString() + "\t"; 
		}
		return retval;
	}
}
