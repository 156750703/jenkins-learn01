package com.jun.jenkinslearn01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String hello(){
        return "hello world! -- 123 ";
    }
}
