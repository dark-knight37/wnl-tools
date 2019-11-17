package formalism.utils;

public class LabelGenerator {
	
	private static int counter = 0;
	
	public static String get() {
		return LabelGenerator.generate("label");
	}

	public static String generate(String s) {
		return s + (counter++);
	}
}