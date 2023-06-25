package com.geekster.Restaurant_Management.controller;

import com.geekster.Restaurant_Management.model.Restaurant;
import com.geekster.Restaurant_Management.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    //Get restaurant by id
    @GetMapping("restaurants/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable Integer restaurantId){
        return restaurantService.getRestaurantById(restaurantId);
    }

    //Get total staff of restaurant by name
    @GetMapping("restaurants/totalStaff/{restaurantName}")
    public int getTotalStaffByName(@PathVariable String restaurantName){
        return restaurantService.getTotalStaffByName(restaurantName);
    }

    //Get all the restaurants
    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }

    // Add some Restaurant to restaurant list using postMapping
    @PostMapping("restaurants")
    public String addRestaurants( @RequestBody List<Restaurant> restaurants){
        return restaurantService.addRestaurants(restaurants);
    }


    // update Restaurant information like speciality
    @PutMapping("restaurants/{restaurantId}")
    public String updateRestaurantById(@PathVariable Integer restaurantId){
        return restaurantService.updateRestaurantById(restaurantId);
    }

    // Delete restaurant by id
    @DeleteMapping("restaurants")
    public String deleteRestaurantById(@RequestParam Integer restaurantId){
        return restaurantService.deleteRestaurantById(restaurantId);
    }

}
