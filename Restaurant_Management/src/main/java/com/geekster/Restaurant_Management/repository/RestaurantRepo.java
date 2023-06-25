package com.geekster.Restaurant_Management.repository;

import com.geekster.Restaurant_Management.configuration.BeanFactory;
import com.geekster.Restaurant_Management.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    BeanFactory restaurantBean;


    public List<Restaurant> getAllRestaurant() {
        return restaurantBean.getRestaurantList();
    }
}
