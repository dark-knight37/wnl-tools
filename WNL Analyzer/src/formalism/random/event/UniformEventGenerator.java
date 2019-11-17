package formalism.random.event;

public class UniformEventGenerator extends ThresholdEventGenerator {

	public UniformEventGenerator(double threshold) {
		super(threshold);
	}
	
	@Override
	public boolean toss() {
		double toss = UniformEventGenerator.engine.nextDouble();
		return toss < this.threshold;
	}
}