package com.greenbean.autorization.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenbean.autorization.entities.User;
import com.greenbean.autorization.services.UserService;

@RestController
@RequestMapping("/name")
public class UserController {
    
    @Autowired
    UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }

}
