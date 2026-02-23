package com.ashar.ride_hailing_system.user.service;

import com.ashar.ride_hailing_system.user.dto.RegisterRequest;
import com.ashar.ride_hailing_system.user.entity.User;
import com.ashar.ride_hailing_system.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User registerUser(RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }
        User user = new User(
                request.getName(),
                request.getEmail(),
                request.getRole()
        );
        return userRepository.save(user);
    }
}