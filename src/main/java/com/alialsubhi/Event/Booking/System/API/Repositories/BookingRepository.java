package com.alialsubhi.Event.Booking.System.API.Repositories;

import com.alialsubhi.Event.Booking.System.API.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
