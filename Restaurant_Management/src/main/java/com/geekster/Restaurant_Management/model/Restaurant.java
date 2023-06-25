package com.geekster.Restaurant_Management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantContact;
    private Integer totalStaff;
    private Speciality restaurantSpeciality;
}
