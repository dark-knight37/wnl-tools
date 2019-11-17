package formalism.random.real;


/**
 * @author Stefano Marrone
 */
public class UniformRealGenerator extends AbstractRealGenerator {

	public UniformRealGenerator(double up, double lo) {
		super(up, lo);
	}

	@Override
	public double roll() {
		double temp = UniformRealGenerator.engine.nextDouble();
		return temp*(this.upperBound - this.lowerBound) + this.lowerBound;
	}
}