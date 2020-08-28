package com.app.hotel.services.impl;

import com.app.hotel.models.BookingDTO;
import com.app.hotel.repos.BookingRepo;
import com.app.hotel.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;


    @Override
    public BookingDTO getBooking(String id) {
        //Create query to find by booking id
        long i = 0;

        BookingDTO bookingDTO = bookingRepo.findById(i).get();
        return bookingDTO;
    }

    @Override
    public ArrayList<BookingDTO> getAllBookings() {
        return (ArrayList<BookingDTO>) bookingRepo.findAll();
    }

    @Override
    public void newBooking(BookingDTO bookingDTO) {
        bookingRepo.save(bookingDTO);
    }


    @Override
    public void cancelBooking(BookingDTO bookingDTO) {
        bookingRepo.delete(bookingDTO);
    }
}
