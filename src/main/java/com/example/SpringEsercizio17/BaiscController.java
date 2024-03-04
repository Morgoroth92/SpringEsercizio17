package com.example.SpringEsercizio17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class BaiscController {
    @Autowired
    private Environment environment;

    @GetMapping("/name")
    public String getName() {
        String name = environment.getProperty("devNameTree.devName");
        return name;
    }
}