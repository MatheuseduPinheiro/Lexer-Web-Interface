package com.br.glcweb.lexer;

public class Token {
    public final int tag;
    
    public Token(int t) {
        tag = t;
    }

    @Override
    public String toString() {
        return "<Token, " + (char) tag + '>';
    }
}
