package com.bezkoder.spring.login.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    user1() {}
    public user1(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}