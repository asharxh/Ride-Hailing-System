package com.ashar.ride_hailing_system.user.entity;

import com.ashar.ride_hailing_system.common.enums.DriverStatus;
import com.ashar.ride_hailing_system.common.enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Enumerated(EnumType.STRING)
    private DriverStatus driverStatus;

    public User() {}

    public User(String name, String email, UserRole role, DriverStatus driverStatus) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.driverStatus = driverStatus;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public UserRole getRole() { return role; }
    public void setRole(UserRole role) { this.role = role; }
    public DriverStatus getDriverStatus() { return driverStatus; }
    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }
}