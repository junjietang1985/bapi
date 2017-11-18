package com.junjie.inMemoryDB;

import com.junjie.model.User;

import java.util.Collections;
import java.util.Map;

public class UserTable {
    public static Map<Long, User> data = initTable();

    public static Map<Long, User> initTable(){
        User user = new User();
        user.setId(1);
        return Collections.singletonMap(1l, user);
    }
}
