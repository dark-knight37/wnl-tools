package wnl.wnl2bn;

import WNLML.Contaminant;
import wnl.textual.domain.Attack;

public class CauseFactory {

	public static Cause generate(Contaminant c) {
		Cause retval = new PhysicalCause(c);
		return retval;
	}
	
	public static Cause generate(Attack a) {
		Cause retval = new LogicalCause(a);
		return retval;
	}
}
