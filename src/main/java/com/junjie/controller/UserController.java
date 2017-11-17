package com.junjie.controller;

import com.junjie.model.User;
import com.junjie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public User getUser(@RequestParam long id){
        return userService.getUser(id);
    }
}
