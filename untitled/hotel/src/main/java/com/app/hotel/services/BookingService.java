package com.app.hotel.services;

import com.app.hotel.models.BookingDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BookingService {
    BookingDTO getBooking(String id);

    ArrayList<BookingDTO> getAllBookings();

    public void newBooking(BookingDTO bookingDTO);

    void cancelBooking(BookingDTO bookingDTO);

}
