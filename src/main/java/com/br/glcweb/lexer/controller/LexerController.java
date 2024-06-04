package com.br.glcweb.lexer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.br.glcweb.lexer.service.LexerService;

@RestController
public class LexerController {

    private final LexerService lexerService;

    public LexerController(LexerService lexerService) {
        this.lexerService = lexerService;
    }

    @PostMapping("/lexer")
    public String parseInput(@RequestBody String input) {
        return lexerService.parseInput(input);
    }

    
}
