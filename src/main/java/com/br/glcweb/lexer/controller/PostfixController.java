package com.br.glcweb.lexer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.br.glcweb.lexer.service.PostfixService;

@RestController
public class PostfixController  {

    private final PostfixService postfixService;

    public PostfixController (PostfixService postfixService) {
        this.postfixService = postfixService;
    }

    @PostMapping("/traducao")
    public String postfixInput(@RequestBody String input) {
        return postfixService.postfixInput(input);
    }

    
}
