package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Indexcontroller {

    @GetMapping("/")
    public @ResponseBody String index() {
        return "Hello, World!!";
    }

    

    @GetMapping("/fire")
    public String fire() {
        return "views/fire";
    }

    @GetMapping("/1")
    public String index1() {
        return "11111";
    }

    
    @GetMapping("/2")
    public String index2() {
        return "22222";
    }
}