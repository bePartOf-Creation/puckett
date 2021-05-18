package com.puckett.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/role")
public class RoleController {

    @GetMapping("/all")
    public void getAllRoles(){

    }

    @GetMapping("/{roleName}")
    public void getRoleByName(){

    }
}
