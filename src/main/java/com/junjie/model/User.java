package com.junjie.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "User")

@Data
@ToString(callSuper = true)
public class User extends Obj {

    public static void main(String[] args){
        User u1 = new User();
        u1.setId(1l);
        u1.setName("nn");
        User u2 = new User();
        u2.setName("n");
        u2.setDeleted(true);
        u1.merge(u2);
        System.out.println(u1);
    }
}
