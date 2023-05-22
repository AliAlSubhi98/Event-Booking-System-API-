package com.alialsubhi.Event.Booking.System.API.Services;

import com.alialsubhi.Event.Booking.System.API.Models.Booking;
import com.alialsubhi.Event.Booking.System.API.Repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }
}
