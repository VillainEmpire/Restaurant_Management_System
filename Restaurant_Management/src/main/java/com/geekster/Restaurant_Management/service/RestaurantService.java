package com.geekster.Restaurant_Management.service;

import com.geekster.Restaurant_Management.model.Restaurant;
import com.geekster.Restaurant_Management.model.Speciality;
import com.geekster.Restaurant_Management.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepo.getAllRestaurant();
    }

    public Restaurant getRestaurantById(Integer restaurantId) {
        List<Restaurant> restaurantList = getAllRestaurant();
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                return restaurant;
            }
        }
        return null;
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> restaurantList = getAllRestaurant();
        restaurantList.addAll(restaurants);
        return "Restaurants added successfully";
    }

    public String updateRestaurantById(Integer restaurantId) {
        List<Restaurant> restaurantList = getAllRestaurant();
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                restaurant.setRestaurantSpeciality(Speciality.DAHI_BALLE);
                return "Speciality updated successfully";
            }
        }

        return "Unable to update Speciality";
    }

    public String deleteRestaurantById(Integer restaurantId) {
        List<Restaurant> restaurantList = getAllRestaurant();
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                restaurantList.remove(restaurant);
                return "Restaurant removed successfully";
            }
        }
        return "Unable to find or delete the restaurant";
    }

    public int getTotalStaffByName(String restaurantName) {
        List<Restaurant> restaurantList = getAllRestaurant();
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getRestaurantName().equals(restaurantName)){
                return restaurant.getTotalStaff();
            }
        }
        return -1;
    }
}
