package formalism.analysis;

import java.util.Vector;

public class TimeSeries implements Results {
	
	protected Vector<Double> times;
	
	protected Vector<Double> values;
	
	public TimeSeries() {
		this.times = new Vector<Double>();
		this.values = new Vector<Double>();
	}

	public void add(double t, double vl) {
		this.times.add(t);
		this.values.add(vl);
	}
		
	public double getValue(double t) throws Exception {
		double retval = 0;
		if ((t >= this.times.elementAt(0)) && (t <= this.times.elementAt(this.times.size()-1))) {
			retval = this.interpolate(this.values,t);
		} else {
			throw new Exception();
		}
		return retval;
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
		return TimeSeries.convert(this.times);
	}
	
	public double[] getValues() {
		return TimeSeries.convert(this.values);
	}

	private static double[] convert(Vector<Double> vd) {
		double[] retval = new double[vd.size()];
		for (int i = 0; i < vd.size(); i++) {
			retval[i] = vd.elementAt(i);
		}
		return retval;
	}
	
	public double getMax() {
		int size = this.values.size();
		double retval = this.values.elementAt(0);
		for (int i = 0; i < size; i++) {
			double temp = this.values.elementAt(i);
			retval = (temp > retval) ? temp : retval;  
		}
		return retval;
	}

	public double getMin() {
		int size = this.values.size();
		double retval = this.values.elementAt(0);
		for (int i = 0; i < size; i++) {
			double temp = this.values.elementAt(i);
			retval = (temp < retval) ? temp : retval;  
		}
		return retval;
	}

	public double getAvg() {
		int size = this.values.size();
		double retval = 0;
		for (int i = 0; i < size; i++) {
			retval += this.values.get(i);  
		}
		return retval/size;
	}
}