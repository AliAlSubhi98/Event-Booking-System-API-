package com.alialsubhi.Event.Booking.System.API.Controllers;

import com.alialsubhi.Event.Booking.System.API.Models.User;
import com.alialsubhi.Event.Booking.System.API.Models.UserRegistrationRequest;
import com.alialsubhi.Event.Booking.System.API.Repositories.UserRepository;
import com.alialsubhi.Event.Booking.System.API.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

/*
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }        // http://localhost:8080/api/users/getAll
*/

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
        // Perform validation on registrationRequest fields (e.g., check for required fields, password complexity, etc.)
        if (registrationRequest.getUsername() == null || registrationRequest.getPassword() == null) {
            return ResponseEntity.badRequest().body("Username and password are required.");
        }

        // Create a new User entity from the registrationRequest data
        User user = new User();
        user.setUsername(registrationRequest.getUsername());
        user.setPassword(registrationRequest.getPassword());

        // Save the user entity using the userRepository
        userRepository.save(user);

        // Return a success response with an appropriate message
        return ResponseEntity.ok("User registered successfully");
    }
    /*     http://localhost:8080/api/users/register
            bode - raw - JSON -> {
            "username": "ali",
            "password": "pass1"
        }
    */


}
