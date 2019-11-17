package formalism.random.dice;

import formalism.random.RandomGenerator;

/**
 * @author Stefano Marrone
 */
public class ZeroDice extends RandomGenerator implements NumberGenerator {
	
	protected int faces;
	
	public ZeroDice() {
		this.faces = 6;
	}
	
	public ZeroDice(int f) {
		this.faces = f;
	}

	public int roll() {		
		int result = ZeroDice.engine.nextInt(this.faces);
		return result;
	}
}