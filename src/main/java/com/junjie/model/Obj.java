package com.junjie.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.Assert;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@MappedSuperclass
@ToString
public abstract class Obj {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter protected Long id;
    @Setter @Getter protected String name;
    @Setter @Getter protected Date created;
    @Setter @Getter protected Date lastModified;
    @Setter @Getter protected Boolean deleted;

    public List<Field> getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));

        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }

        return fields;
    }


    public Obj merge(Obj patch) {
        Assert.isTrue(this.getClass().equals(patch.getClass()),
                String.format("The class of from1: %s and from 2: %s must be the same.", this.getClass(), patch.getClass()));
        List<Field> allFileds = new ArrayList<>();
        getAllFields(allFileds, this.getClass());
        for(Field field : allFileds){
            try {
                Object newValue = field.get(patch);
                if(newValue != null){
                    field.set(this, newValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return this;
    }
}
