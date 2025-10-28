package com.vr1.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vr1.auth.db.UserService;

@RestController
@RequestMapping("/DbTest")
public class DemoController{

    @Autowired
    private UserService userService;

    @GetMapping
    public String demo(){
        userService.testConnection();
        return "Db connected";
    }
}