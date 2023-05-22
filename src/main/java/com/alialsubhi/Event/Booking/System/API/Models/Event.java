package com.alialsubhi.Event.Booking.System.API.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Setter
@Getter
@Entity
@Table(name = "events")
    public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    LocalDate date;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    int ticketAvailability;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    List<Booking> bookings;

}
