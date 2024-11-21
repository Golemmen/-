package com.example.fooddelivery.deliveryservice;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    public String assignCourier(String orderId) {
        // Placeholder logic for assigning a courier
        return "Courier assigned to Order ID: " + orderId;
    }

    public String getDeliveryStatus(String orderId) {
        // Placeholder logic for getting delivery status
        return "Status of Order ID " + orderId + ": On the way!";
    }
}



