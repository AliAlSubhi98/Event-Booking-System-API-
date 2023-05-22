package com.alialsubhi.Event.Booking.System.API.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;

    String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Booking> bookings;

}
