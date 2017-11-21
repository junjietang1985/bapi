package com.junjie.service;

import com.junjie.dao.UserDao;
import com.junjie.model.User;
import com.junjie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.tomcat.jni.Mmap.delete;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    @Autowired
    UserRepository userRepository;

    public User getUser(long id){
        return userRepository.findOne(id);
    }

    public User saveUser(User user){
        return userDao.upsert(user);
    }

    public User deleteUser(long id){
        return userDao.delete(id);
    }
}
