package com.puckett.app.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/api/v1/auth")
public class UserController {

    @PostMapping("/register")
    public void registerUser(){

    }

    @PostMapping("/login")
    public void loginUser(){

    }
}
