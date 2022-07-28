package com.prem.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String root(){
        return "Premkumar in root";
    }

    @GetMapping("/home")
    public String home(){
        return "Premkumar in Home page";
    }

    @GetMapping("/prem")
    public String hello(){
        return "Premkumar";
    }
}
