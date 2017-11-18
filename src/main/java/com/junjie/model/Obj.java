package com.junjie.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public abstract class Obj {
    @Setter @Getter protected long id;
    @Setter @Getter protected String name;
    @Setter @Getter protected Date created;
    @Setter @Getter protected Date lastModified;
    @Setter @Getter protected boolean deleted;
}
