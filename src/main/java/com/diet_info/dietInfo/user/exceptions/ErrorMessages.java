package com.diet_info.dietInfo.user.exceptions;

public enum ErrorMessages {
    USER_NOT_FOUND("User not found"),
    USERNAME_REQUIRED("Username is required"),
    PASSWORD_REQUIRED("Password is required"),
    PASSWORD_INVALID_LENGTH("Password must be at least 8 characters long"),
    INVALID_WEIGHT("Weight must be greater than 0.0"),
    INVALID_HEIGHT("Height must be greater than 0.0");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
