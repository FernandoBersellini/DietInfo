package com.diet_info.dietInfo.user.model;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
    private double bmi;

    public UserDTO(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.bmi = user.getWeight() / (user.getHeight() * user.getHeight());
    }
}
