package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java")
public class javaController {

    @GetMapping("")
    String javamethod() {

        return "/java";
    }

    @GetMapping("/opps")
    String helloMethod() {
        return "Hello World";
    }

}
