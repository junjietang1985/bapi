package com.junjie.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "User")

@Data
public class User extends Obj {
}
