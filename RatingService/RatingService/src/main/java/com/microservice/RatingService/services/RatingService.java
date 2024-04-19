package com.microservice.RatingService.services;

import com.microservice.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);



}
