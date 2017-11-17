package com.junjie.dao;

import com.junjie.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User get(long i){
        User user = new User();
        user.setId(i*i);
        return user;
    }
}
