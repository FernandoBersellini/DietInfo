package com.diet_info.dietInfo.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private long id;

    private String username;
    private String password;
    private int age;
    private double weight;
    private double height;
}
