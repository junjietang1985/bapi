package com.junjie.service;

import com.junjie.dao.UserDao;
import com.junjie.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUser(long i){
        return userDao.get(i);
    }
}
