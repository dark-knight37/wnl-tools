package wnl.wnl2bn;

import WNLML.Contaminant;

public class PhysicalCause extends Cause {
	
	private Contaminant inner;
	
	public PhysicalCause(Contaminant c) {
		this.inner = c;
	}
	
	public String toString() {
		return this.inner.toString();
	}
	
	public String getName() {
		return this.inner.getName();
	}

	@Override
	public boolean isLogical() {
		return false;
	}

	@Override
	public boolean isPhysical() {
		return true;
	}

	@Override
	public double getAttackProbability() {
		return this.inner.getSuccessProb();
	}
}