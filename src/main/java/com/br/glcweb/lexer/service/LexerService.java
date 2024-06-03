package com.br.glcweb.lexer.service;

import com.br.glcweb.lexer.Lexer;
import com.br.glcweb.lexer.Tag;
import com.br.glcweb.lexer.Token;

import java.io.IOException;
import java.io.InputStream;
import org.apache.activemq.util.ByteArrayInputStream;
import org.springframework.stereotype.Service;

@Service
public class LexerService {

    public String parseInput(String input) {
        StringBuilder result = new StringBuilder();
        try {
            // Cria um Lexer com a entrada fornecida
            InputStream inputStream = new ByteArrayInputStream(input.getBytes());
            Lexer lexer = new Lexer(inputStream);
            
            // Faz a análise léxica do texto fornecido
            Token token;
            while ((token = lexer.scan()).tag != Tag.EOF) {
                result.append(token.toString()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
