package com.junjie.controller;

import com.junjie.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user")
    public User getUser(@RequestParam long id){
        User user =  new User();
        user.setId(id);
        return user;
    }
}
