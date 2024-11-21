package com.example.fooddelivery.paymentservice;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(String orderId) {
        // Placeholder for actual payment logic (e.g., integrating with Stripe)
        return "Payment processed for Order ID: " + orderId;
    }
}
