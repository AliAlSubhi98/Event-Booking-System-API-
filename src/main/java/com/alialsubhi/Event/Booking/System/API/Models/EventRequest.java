package com.alialsubhi.Event.Booking.System.API.Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class EventRequest {
    private String name;
    private LocalDate date;
    private String location;
    private int ticketAvailability;

}
