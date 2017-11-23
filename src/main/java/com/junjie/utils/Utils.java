package com.junjie.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;

public class Utils {
    public static <T> void merge(T from1, T from2, T to){
        System.out.println("***************");
        System.out.println(from1.getClass());
        System.out.println("***************");
//        Assert.isTrue();
        BeanUtils.copyProperties(from1, to);
        System.out.println(from1.toString());
        System.out.println(to.toString());

        BeanUtils.copyProperties(from2, to);
        System.out.println(from2.toString());
        System.out.println(to.toString());
    }
}
