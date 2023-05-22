package com.alialsubhi.Event.Booking.System.API.Repositories;

import com.alialsubhi.Event.Booking.System.API.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
