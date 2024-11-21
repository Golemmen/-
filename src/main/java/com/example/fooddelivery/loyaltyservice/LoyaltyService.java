package com.example.fooddelivery.loyaltyservice;

import org.springframework.stereotype.Service;

@Service
public class LoyaltyService {

    // Placeholder for loyalty points storage (could be Redis or PostgreSQL)
    private int points = 0;

    public String addPoints(String userId, int points) {
        this.points += points; // Simple logic to add points
        return "Added " + points + " points to User ID: " + userId;
    }

    public int getPoints(String userId) {
        return points; // Return the total points (simplified logic)
    }
}
