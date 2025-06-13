package com.mateus_lima.service.one.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${message:Hello default}")
    private String mensage;
    @GetMapping("/message")
    public String getMessage(){
        return  mensage;
    }
}
