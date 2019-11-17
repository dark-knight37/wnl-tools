package formalism.analysis;

import java.util.Vector;

import formalism.features.Measurable;

public class MultipleMeasure extends Measure {

	protected Vector<Results> resultArray;
	
	protected Vector<Measurable> measurableArray;
	
	public MultipleMeasure(String name) {
		this.measurableArray = new Vector<Measurable>();
		this.resultArray = new Vector<Results>();
	}

	public MultipleMeasure(String name, Measurable m){
		this.measurableArray = new Vector<Measurable>();
		this.measurableArray.add(m);
		this.resultArray = new Vector<Results>();
	}
	
	public void setResults(Vector<Results> mr) {
		this.resultArray = mr;
	}

	public void setResults(Results mr) {
		Vector<Results> temp = new Vector<Results>();
		temp.add(mr);
		this.resultArray = temp;
	}

	public void addResults(Results mr) {
		this.resultArray.add(mr);
	}

	public void addResults(Vector<Results> mr) {
		this.resultArray.addAll(mr);
	}

	public int size() {
		return this.measurableArray.size();
	}

	public Results getResults(int i) {
		return ((i >= 0) && (i<this.resultArray.size())) ? this.resultArray.get(i) : null;
	}
	
	public Results getResults() {
		return this.getResults(0);
	}

	public void setMeasurable(Measurable m) {
		Vector<Measurable> temp = new Vector<Measurable>();
		temp.add(m);
		this.measurableArray = temp;
	}

	public Measurable getMeasurable() {
		return this.getMeasurable(0);
	}

	public Measurable getMeasurable(int i) {
		boolean present = (i >= 0) && (i < this.size());
		return (present) ? this.measurableArray.get(i) : null;
	}
	
	public void addMeasurable(Measurable m) {
		this.measurableArray.add(m);
	}
}