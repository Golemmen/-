package com.example.fooddelivery.notificationservice;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String sendNotification(String message) {
        // Placeholder logic for sending notifications
        // This could integrate with services like Twilio, MailGun, etc.
        return "Notification sent: " + message;
    }
}
