package com.br.glcweb.lexer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoutesController {

    @GetMapping("/")
    public String home() {
        return "index"; // Retorna o nome do template Thymeleaf (index.html)
    }

    @GetMapping("/traduzir")
    public String postfix() {
        return "postfix"; // Retorna o nome do template Thymeleaf (postfix.html)
    }
}
