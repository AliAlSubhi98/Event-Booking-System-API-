package com.alialsubhi.Event.Booking.System.API.Controllers;

import com.alialsubhi.Event.Booking.System.API.Models.Event;
import com.alialsubhi.Event.Booking.System.API.Models.EventRequest;
import com.alialsubhi.Event.Booking.System.API.Repositories.EventRepository;
import com.alialsubhi.Event.Booking.System.API.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class EventsController {
    @Autowired
    EventRepository eventRepository;

    @Autowired
    EventService eventService;

    @PostMapping("/events")
    public ResponseEntity<String> createEvent(@RequestBody EventRequest eventRequest) {
        // Perform validation on eventRequest fields
        if (eventRequest.getName() == null || eventRequest.getDate() == null || eventRequest.getLocation() == null) {
            return ResponseEntity.badRequest().body("Event name, date, and location are required.");
        }

        // Create a new Event entity from the eventRequest data
        Event event = new Event();
        event.setName(eventRequest.getName());
        event.setDate(eventRequest.getDate());
        event.setLocation(eventRequest.getLocation());
        event.setTicketAvailability(eventRequest.getTicketAvailability());

        // Save the event entity using the EventRepository
        eventRepository.save(event);

        // Return a success response with an appropriate message
        return ResponseEntity.ok("Event created successfully");
    }

}
