package com.ashar.ride_hailing_system.user.controller;

import com.ashar.ride_hailing_system.user.entity.User;
import com.ashar.ride_hailing_system.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }
}