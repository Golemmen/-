package com.example.fooddelivery.loyaltyservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loyalty")
public class LoyaltyController {

    private final LoyaltyService loyaltyService;

    public LoyaltyController(LoyaltyService loyaltyService) {
        this.loyaltyService = loyaltyService;
    }

    @PostMapping("/addPoints")
    public String addPoints(@RequestParam String userId, @RequestParam int points) {
        return loyaltyService.addPoints(userId, points);
    }

    @GetMapping("/getPoints/{userId}")
    public int getPoints(@PathVariable String userId) {
        return loyaltyService.getPoints(userId);
    }
}






