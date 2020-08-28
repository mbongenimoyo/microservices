package com.app.hotel.controllers;

import com.app.hotel.models.BookingDTO;
import com.app.hotel.repos.HotelRepo;
import com.app.hotel.services.BookingService;
import com.app.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookingControllers {
    @Autowired
    HotelRepo hotelRepo;


    @Autowired
    BookingService bookingService;

    @GetMapping("/booking/")
    public ArrayList<BookingDTO> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/bookings/{id}")
    public BookingDTO getBooking(@PathVariable String id) {

        return bookingService.getBooking(id);
    }


    @PostMapping("/booking/new")
    public void newBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.newBooking(bookingDTO);
    }

    @PostMapping("/hotel/booking/cancel")
    public void cancelBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.cancelBooking(bookingDTO);
    }
}
