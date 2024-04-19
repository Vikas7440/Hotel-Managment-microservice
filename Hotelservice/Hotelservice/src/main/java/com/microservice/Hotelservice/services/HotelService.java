package com.microservice.Hotelservice.services;

import com.microservice.Hotelservice.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}
