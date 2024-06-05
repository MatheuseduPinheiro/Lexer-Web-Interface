package com.br.glcweb.lexer.service;

import com.br.glcweb.lexer.Lexer;
import com.br.glcweb.lexer.Token;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class PostfixService {

    private Lexer lexer;

    public String postfixInput(String input) {
        try {
            lexer = new Lexer(new ByteArrayInputStream(input.getBytes()));
            Token lookahead = lexer.scan(); // Lookahead local para cada chamada a postfixInput
            StringBuilder result = new StringBuilder();
            expr(result, lookahead);
            result.append('\n');
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Erro ao processar a entrada: " + e.getMessage();
        }
    }

    private void expr(StringBuilder result, Token lookahead) throws IOException {
        term(result, lookahead);
        while (true) {
            char tagChar = (char) lookahead.tag;
            if (tagChar == '+' || tagChar == '-' || tagChar == '*' || tagChar == '/') {
                match(lookahead.tag);
                term(result, lexer.scan());
                result.append(tagChar);
            } else {
                break;
            }
        }
    }

    private void term(StringBuilder result, Token lookahead) {
        if (lookahead.tag == 256 || lookahead.tag == 257) {
            result.append(lookahead).append(' ');
        } else {
            throw new SyntaxError("Erro de sintaxe: termo esperado, mas encontrado " + lookahead);
        }
    }

    private void match(int t) throws IOException {
        Token nextToken = lexer.scan();
        if (nextToken.tag != t) {
            throw new SyntaxError("Erro de sintaxe: esperado " + t + ", encontrado " + nextToken);
        }
    }

    private static class SyntaxError extends RuntimeException {
        SyntaxError(String message) {
            super(message);
        }
    }
}
