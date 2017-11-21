package com.junjie.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Obj {
    @Id @Setter @Getter protected long id;
    @Setter @Getter protected String name;
    @Setter @Getter protected Date created;
    @Setter @Getter protected Date lastModified;
    @Setter @Getter protected boolean deleted;
}
