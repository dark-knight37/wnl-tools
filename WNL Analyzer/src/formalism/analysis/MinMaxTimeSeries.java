package formalism.analysis;

import java.util.Vector;

public class MinMaxTimeSeries implements Results {
	
	protected Vector<Double> times;
	
	protected Vector<Double> mins;
	
	protected Vector<Double> maxs;
	
	public MinMaxTimeSeries() {
		this.times = new Vector<Double>();
		this.mins = new Vector<Double>();
		this.maxs = new Vector<Double>();
	}

	public void add(double t, double mn, double mx) {
		this.times.add(t);
		this.mins.add(mn);
		this.maxs.add(mx);
	}
	
	public double getMax(double t) throws Exception {
		double retval = 0;
		if ((t >= this.times.elementAt(0)) && (t <= this.times.elementAt(this.times.size()-1))) {
			retval = this.interpolate(this.maxs,t);
		} else {
			throw new Exception();
		}
		return retval;
	}
	
	public double getMin(double t) throws Exception {
		double retval = 0;
		if ((t >= this.times.elementAt(0)) && (t <= this.times.elementAt(this.times.size()-1))) {
			retval = this.interpolate(this.mins,t);
		} else {
			throw new Exception();
		}
		return retval;
	}

	public double getAvg(double t) throws Exception {
		return (this.getMax(t) + this.getMin(t)) / 2;
	}

	public double getConfidence(double t) throws Exception {
		return this.getMax(t) - this.getMin(t);
	}
	
	private double interpolate(double xa, double ya, double xb, double yb, double x) {
		double m = (yb - ya) / (xb - xa);
		double y = ya + m * (x - xa);
		return y;
	}

	private double interpolate(Vector<Double> v, double t) {
		int i = -1;
		double retval = 0;
		boolean found = false;
		while (!found) {
			i++;
			found = this.times.elementAt(i) >= t;
		}
		if (this.times.elementAt(i) == t) {
			retval = v.elementAt(i); 
		} else {
			double ta = this.times.elementAt(i-1);
			double tb = this.times.elementAt(i);
			double va = v.elementAt(i-1);
			double vb = v.elementAt(i);
			this.interpolate(ta,va,tb,vb,t);
		}
		return retval;
	}
	
	public double[] getTimes() {
		return MinMaxTimeSeries.convert(this.times);
	}
	
	public double[] getMaxs() {
		return MinMaxTimeSeries.convert(this.maxs);
	}

	public double[] getMins() {
		return MinMaxTimeSeries.convert(this.mins);
	}

	private static double[] convert(Vector<Double> vd) {
		double[] retval = new double[vd.size()];
		for (int i = 0; i < vd.size(); i++) {
			retval[i] = vd.elementAt(i);
		}
		return retval;
	}
	
	public double[] getAverage() {
		int len = this.getSampleNumber();
		double[] retval = new double[len];
		double[] maxs = this.getMaxs();
		double[] mins = this.getMins();
		for (int i = 0; i < len; i++) {
			retval[i] = (maxs[i] + mins[i]) / 2;
		}
		return retval;
	}	

	private int getSampleNumber() {
		return this.getMaxs().length;
	}

	public double getAbsoluteMax() {
		int size = this.maxs.size();
		double retval = this.maxs.elementAt(0);
		for (int i = 0; i < size; i++) {
			retval = (this.maxs.elementAt(i) > retval) ? this.maxs.elementAt(i) : retval;  
		}
		return retval;
	}

	public double getAbsoluteMin() {
		int size = this.mins.size();
		double retval = this.mins.elementAt(0);
		for (int i = 0; i < size; i++) {
			retval = (this.mins.elementAt(i) < retval) ? this.mins.elementAt(i) : retval;  
		}
		return retval;
	}

	public double getAvg() {
		int size = this.maxs.size();
		double[] avgs = this.getAverage();
		double retval = 0;
		for (int i = 0; i < size; i++) {
			retval += avgs[i];  
		}
		return retval/size;
	}
}