package com.example.fooddelivery.deliveryservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping("/assign")
    public String assignCourier(@RequestParam String orderId) {
        return deliveryService.assignCourier(orderId);
    }

    @GetMapping("/status/{orderId}")
    public String getDeliveryStatus(@PathVariable String orderId) {
        return deliveryService.getDeliveryStatus(orderId);
    }
}
