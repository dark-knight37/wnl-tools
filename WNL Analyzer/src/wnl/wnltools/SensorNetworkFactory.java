package wnl.wnltools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import wnl.textual.domain.SensorNetwork;
import wnl.textual.lexer.Lexer;
import wnl.textual.lexer.LexerException;
import wnl.textual.node.Start;
import wnl.textual.parser.Parser;
import wnl.textual.parser.ParserException;

public class SensorNetworkFactory {

	public static SensorNetwork generate(String filename) throws ParserException, LexerException, IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		PushbackReader pr = new PushbackReader(br, 2048);
		Lexer lexer = new Lexer(pr);
		Parser parser = new Parser(lexer);
		Start root = parser.parse();
		SensorNetwork sn = new SensorNetwork();
		root.apply(sn);
		return sn;
	}
}
