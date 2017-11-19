package com.junjie.service;

import com.junjie.dao.UserDao;
import com.junjie.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.tomcat.jni.Mmap.delete;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUser(long id){
        return userDao.get(id);
    }

    public User saveUser(User user){
        return userDao.upsert(user);
    }

    public User deleteUser(long id){
        return userDao.delete(id);
    }
}
