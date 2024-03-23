package com.example.dockerspringboot.controllers;

import com.example.dockerspringboot.models.User;
import com.example.dockerspringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUserS();
    }
}
