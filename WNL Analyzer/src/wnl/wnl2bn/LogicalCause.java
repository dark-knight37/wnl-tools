package wnl.wnl2bn;

import wnl.textual.domain.Attack;

public class LogicalCause extends Cause {
	
	private Attack inner; 

	public LogicalCause(Attack a) {
		this.inner = a;
	}
	
	@Override
	public String toString() {
		return this.inner.toString();
	}

	@Override
	public String getName() {
		return inner.getName();
	}

	@Override
	public boolean isLogical() {
		return true;
	}

	@Override
	public boolean isPhysical() {
		return false;
	}

	@Override
	public double getAttackProbability() {
		return this.inner.getSuccessProb();
	}
	
}