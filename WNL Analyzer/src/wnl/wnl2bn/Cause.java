package wnl.wnl2bn;

public abstract class Cause {
	
	public abstract String toString();

	public abstract String getName();
	
	public abstract boolean isLogical();
	
	public abstract boolean isPhysical();
	
	public abstract double getAttackProbability(); 
}