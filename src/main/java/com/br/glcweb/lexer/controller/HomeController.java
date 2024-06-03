package com.br.glcweb.lexer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Retorna o nome do template Thymeleaf (index.html)
    }
}