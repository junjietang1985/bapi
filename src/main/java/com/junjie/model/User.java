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
}
