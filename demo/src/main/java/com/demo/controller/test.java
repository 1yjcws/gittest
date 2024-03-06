package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
   @RequestMapping("/test")
    public String test(){
        System.out.println("hello");
        return  "hello";
    }
}
