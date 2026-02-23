package com.ashar.ride_hailing_system.user.dto;

import com.ashar.ride_hailing_system.common.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RegisterRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid Email format")
    @NotBlank(message = "Email is Required")
    private String email;

    @NotNull(message = "Role is Required")
    private UserRole role;

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public UserRole getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRole(UserRole role) {
        this.role = role;
    }
}