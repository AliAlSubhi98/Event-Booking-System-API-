package com.alialsubhi.Event.Booking.System.API.Repositories;

import com.alialsubhi.Event.Booking.System.API.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
