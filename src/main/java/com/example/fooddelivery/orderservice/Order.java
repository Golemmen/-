package com.example.fooddelivery.orderservice;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
    private String id;
    private String userId;
    private String restaurantId;
    private String status;
    // Getters and Setters
}
