package com.alialsubhi.Event.Booking.System.API.Services;

import com.alialsubhi.Event.Booking.System.API.Models.Event;
import com.alialsubhi.Event.Booking.System.API.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

}
