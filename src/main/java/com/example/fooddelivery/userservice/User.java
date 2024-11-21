package com.example.fooddelivery.userservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    // Getters and Setters
}
