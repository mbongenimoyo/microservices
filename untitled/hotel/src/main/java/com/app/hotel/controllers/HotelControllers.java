package com.app.hotel.controllers;

import com.app.hotel.models.BookingDTO;
import com.app.hotel.repos.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HotelControllers {

    @Autowired
    public HotelRepo hotelRepo;

    @PostMapping("/hotel/addhotel")
    public void addHotel() {

    }


}
