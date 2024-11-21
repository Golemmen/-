package com.example.fooddelivery.searchservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/restaurants")
    public String searchRestaurants(@RequestParam String query) {
        return searchService.searchRestaurants(query);
    }

    @GetMapping("/dishes")
    public String searchDishes(@RequestParam String query) {
        return searchService.searchDishes(query);
    }
}
