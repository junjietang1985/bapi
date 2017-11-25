//package com.junjie.utils;
//
//import com.junjie.model.User;
//import org.springframework.util.Assert;
//
//import javax.swing.plaf.synth.SynthEditorPaneUI;
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Utils {
//    public static List<Field> getAllFields(List<Field> fields, Class<?> type) {
//        fields.addAll(Arrays.asList(type.getDeclaredFields()));
//
//        if (type.getSuperclass() != null) {
//            getAllFields(fields, type.getSuperclass());
//        }
//
//        return fields;
//    }
//
//    public static <T> T merge(T base, T patch) {
//        Assert.isTrue(base.getClass().equals(patch.getClass()),
//                String.format("The class of from1: %s and from 2: %s must be the same.", base.getClass(), patch.getClass()));
//        System.out.println(base.getClass().getSuperclass().getFields().length);
//        System.out.println(base.getClass().getSuperclass().getDeclaredFields()[1]);
//        List<Field> allFileds = new ArrayList<>();
//        getAllFields(allFileds, base.getClass());
//        for(Field field : allFileds){
//            System.out.println(field);
//            try {
//                Object newValue = field.get(patch);
//                if(newValue != null){
//                    field.set(base, newValue);
//                }
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//        return base;
//    }
//
//    public static void main(String[] args) {
//        User u1 = new User();
//        u1.setId(1);
//        User u2 = new User();
//        u2.setName("n");
//        u2.setDeleted(true);
//        Utils.merge(u1, u2);
//        System.out.println(u1);
//    }
//}
