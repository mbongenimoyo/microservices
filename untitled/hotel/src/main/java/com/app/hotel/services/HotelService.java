package com.app.hotel.services;

import com.app.hotel.models.BookingDTO;
import com.app.hotel.models.HotelDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface HotelService {

//    BookingDTO getBooking(String id);
//
//    ArrayList<BookingDTO> getAllBookings();
//
//    public void newBooking(BookingDTO bookingDTO);
//
//    void addHotel(BookingDTO bookingDTO);
//
//    void cancelBooking(BookingDTO bookingDTO);

    public void addHotel(HotelDTO hotelDTO);


}
