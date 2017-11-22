package com.junjie.service;

import com.junjie.model.User;
import com.junjie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(long id){
        return userRepository.findOne(id);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
