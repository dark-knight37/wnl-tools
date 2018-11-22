package org.wnl.textual.test;

import java.io.PushbackReader;

import org.wnl.textual.lexer.Lexer;

class PrintLexer extends Lexer {
	PrintLexer(PushbackReader reader) {
		super(reader);
	}

	protected void filter() {
		System.out.println(token.getClass() + ", state : " + state.id() + ", text : [" + token.getText() + "]");
	}
}