package com.junjie.dao;

import com.junjie.inMemoryDB.UserTable;
import com.junjie.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User get(long i) {
        return UserTable.data.get(i);
    }

    public User upsert(User user) {
        return UserTable.data.put(user.getId(), user);
    }

    public User delete(long id){
        User user = UserTable.data.get(id);
        if(user == null)
            return null;
        else{
            user.setDeleted(true);
            return this.upsert(user);
        }
    }
}
