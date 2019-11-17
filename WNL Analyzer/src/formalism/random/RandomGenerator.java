package formalism.random;

import java.util.Random;

public abstract class RandomGenerator implements BareGenerator {

	protected static Random engine;
	
	public RandomGenerator() {
		if (RandomGenerator.engine == null) {
			RandomGenerator.engine = new Random();
		}
		this.reset();
	}

	public void reset() {
		long seed = System.currentTimeMillis();
		RandomGenerator.engine.setSeed(seed);
	}
}