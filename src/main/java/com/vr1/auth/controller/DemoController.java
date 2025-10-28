package com.vr1.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restDemo")
public class DemoController{

    @GetMapping
    public String demo(){
        return "Welcome to Rest api demo";
    }
}