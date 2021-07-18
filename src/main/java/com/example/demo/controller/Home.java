package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/")
    public String homePage(){
        return "I am in HomePage";
    }

    @RequestMapping("/profile")
    public String profile(){
        //System.out.println("I am Azad Singh");
        return "Azad Singh";
    }
}
