package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "ciao";
    }
}
