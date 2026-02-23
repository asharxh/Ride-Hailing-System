package com.ashar.ride_hailing_system.user.service;

import com.ashar.ride_hailing_system.user.entity.User;
import com.ashar.ride_hailing_system.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}