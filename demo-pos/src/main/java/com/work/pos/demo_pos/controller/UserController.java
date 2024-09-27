package com.work.pos.demo_pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.work.pos.demo_pos.service.UserService;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getUserByID(@RequestParam Long id) {
        return userService.getUserById(id);
    }

}
