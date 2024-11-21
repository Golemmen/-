package com.example.fooddelivery.searchservice;

import org.springframework.stereotype.Service;

@Service
public class SearchService {

    public String searchRestaurants(String query) {
        // Placeholder logic for searching restaurants
        return "Search results for restaurants matching: " + query;
    }

    public String searchDishes(String query) {
        // Placeholder logic for searching dishes
        return "Search results for dishes matching: " + query;
    }
}

