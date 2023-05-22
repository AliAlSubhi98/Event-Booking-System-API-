package com.alialsubhi.Event.Booking.System.API.Services;

import com.alialsubhi.Event.Booking.System.API.Models.User;
import com.alialsubhi.Event.Booking.System.API.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
