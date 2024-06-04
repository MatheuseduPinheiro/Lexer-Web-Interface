package com.br.glcweb.lexer.service;

import com.br.glcweb.lexer.Lexer;

import com.br.glcweb.lexer.Token;

import org.springframework.stereotype.Service;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Service
public class PostfixService {
    
    static Token lookahead;
    static Lexer lexer;

    public String postfixInput(String input) {
        StringBuilder result = new StringBuilder();

        try {
            lexer = new Lexer(new ByteArrayInputStream(input.getBytes()));
            lookahead = lexer.scan();
            expr(result);
            result.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
            result.append("Erro! ").append(e.getMessage());
        }

        return result.toString();
    }

    private void expr(StringBuilder result) throws IOException { 
        term(result);
        while(true) {
            if((char) lookahead.tag == '+' ) {
                match('+'); 
                term(result); 
                result.append('+'); 
            }
            else if((char) lookahead.tag == '-' ) {
                match('-'); 
                term(result); 
                result.append('-');
            }
            else if((char) lookahead.tag == '/') {
                match('/');
                term(result);
                result.append('/');
            } else if ((char) lookahead.tag == '*') {
                match('*');
                term(result);
                result.append('*');
            } else if ((char) lookahead.tag == '=') {
                match('=');
                term(result);
                result.append('=');
            } else {
                return; 
            }
        }
    }

    private void term(StringBuilder result) throws IOException {
        if(lookahead.tag == 256 || lookahead.tag == 257) {
            result.append(lookahead.toString()); 
            match(lookahead.tag); 
        } else { 
            result.append("Erro!");
            throw new Error("syntax error"); 
        }
    }

    private void match(int t) throws IOException {
        if(lookahead.tag == t) {
            lookahead = lexer.scan();
        } else {
            throw new Error("syntax error");
        }
    }
}
