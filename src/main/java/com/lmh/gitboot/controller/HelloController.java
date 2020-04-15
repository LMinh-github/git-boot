package com.lmh.gitboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Git";
    }

    @RequestMapping("/ssh")
    public String ssh(){
        return "Hello SSH";
    }
}
