package com.app.hotel.repos;

import com.app.hotel.models.BookingDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends CrudRepository<BookingDTO, Long> {

}
