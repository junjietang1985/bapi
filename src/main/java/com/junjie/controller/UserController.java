package com.junjie.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import com.junjie.model.User;
import com.junjie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable long userId){
        return userService.getUser(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        User newUser = userService.saveUser(user);
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setLocation(linkTo(methodOn(this.getClass()).getUser(newUser.getId())).toUri());
        return this.getUser(newUser.getId());
    }

    //TODO in memory db does not work
}
