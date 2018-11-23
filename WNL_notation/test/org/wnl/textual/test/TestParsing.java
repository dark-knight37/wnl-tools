package org.wnl.textual.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackReader;

import org.wnl.textual.lexer.Lexer;
import org.wnl.textual.node.Start;
import org.wnl.textual.parser.Parser;

public class TestParsing {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			PushbackReader pr = new PushbackReader(br, 2048);
			Lexer lexer = new Lexer(pr);
			Parser parser = new Parser(lexer);
			Start root = parser.parse();
			System.out.println("Have a nice day :)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}