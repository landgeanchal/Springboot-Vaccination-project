package com.project.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.vaccination.Service.UserServiceIMPL;
import com.project.vaccination.model.User;

@Controller
public class UserController {
    
     @Autowired
    UserServiceIMPL service;

    @GetMapping("/about")
    public String about() {
        return "aboutUs";
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/Contact")
    public String contactpage() {
        return "Contact";
    }

    @GetMapping("/register")
    public String registerpage() {
        return "register";
    }

    @GetMapping("/login")
    public String loginpage() {
        return "login";
    }

    @PostMapping("/register1")
    public String register1(@ModelAttribute User b) {
        service.addUser(b);
        System.out.println("UserAdded!");
        return "login";
    }

}
