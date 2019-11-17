package wnl.wnl2bn.utils;

import java.util.Hashtable;
import java.util.Stack;

public class Utils {

	public static String[] decode(int i, int len) {
		String[] retval = new String[len];
		String[] values = {"ko", "ok"};
		for (int k=0; k<len; k++) {
			retval[k] = "ko";
		}
		Stack<Integer> stack = new Stack<Integer>();
		while (i != 0) {
			int d = i % 2;
			stack.push(d);
			i /= 2;
		}
		int ssize = stack.size();
		i = len-1;
		for (int index = (len - ssize); index < len; index++) {
	    	retval[index] = values[stack.pop()];
		}
	    return retval;
	}
	
	public static String debugHashtable(Hashtable<String,Double> t) {
		String retval = "";
		retval += "P(ok) = " + t.get("ok") + "\n";
		retval += "P(ko) = " + t.get("ko") + "\n";
		return retval;
	}
	
	public static String debugCSV(Hashtable<String,Double> t) {
		return t.get("ok") + ";" + t.get("ko") + ";";
	}
}
