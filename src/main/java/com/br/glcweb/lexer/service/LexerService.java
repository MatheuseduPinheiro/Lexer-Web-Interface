package com.br.glcweb.lexer.service;

import org.springframework.stereotype.Service;

@Service
public class LexerService {

    public String parseInput(String input) {
        // Lógica de análise léxica aqui
        return "Resultado da análise léxica para o input: " + input;
    }
}