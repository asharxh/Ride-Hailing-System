package com.ashar.ride_hailing_system.user.repository;

import com.ashar.ride_hailing_system.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}