package com.example.Swagger02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
        @GetMapping(value = "")
        public String defaultController(){
            return "Welcome to localhost:5050 SUPERMIRKOPLUS8000";
        }
    }