package com.junjie.inMemoryDB;

import com.junjie.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserTable {
    public static Map<Long, User> data = initTable();

    public static Map<Long, User> initTable() {
        User user = new User();
        user.setId(1);
        Map<Long, User> ret = new HashMap<>();
        ret.put(user.getId(), user);
        return ret;
    }
}
