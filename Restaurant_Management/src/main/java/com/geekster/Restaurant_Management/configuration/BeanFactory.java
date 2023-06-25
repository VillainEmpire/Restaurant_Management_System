package com.geekster.Restaurant_Management.configuration;

import com.geekster.Restaurant_Management.model.Restaurant;
import com.geekster.Restaurant_Management.model.Speciality;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<Restaurant> getRestaurantList(){
        Restaurant restaurant = new Restaurant(1,"Radhey Sweets","Farrukhnagar","8059598349",20, Speciality.SMOSA);
        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(restaurant);
        return restaurantList;
    }


}
