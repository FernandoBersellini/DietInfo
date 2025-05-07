package com.diet_info.dietInfo.user.validators;

import com.diet_info.dietInfo.user.exceptions.ErrorMessages;
import com.diet_info.dietInfo.user.exceptions.UserNotValidException;
import com.diet_info.dietInfo.user.model.User;
import org.springframework.util.StringUtils;

public class UserValidator {

    private UserValidator() {

    }

    public static void isValid(User user) {
        if (StringUtils.isEmpty(user.getUsername())) {
            throw new UserNotValidException(ErrorMessages.USERNAME_REQUIRED.getMessage());
        }

        if (StringUtils.isEmpty(user.getPassword())) {
            throw new UserNotValidException(ErrorMessages.PASSWORD_REQUIRED.getMessage());
        }

        if (user.getPassword().length() < 8) {
            throw new UserNotValidException(ErrorMessages.PASSWORD_INVALID_LENGTH.getMessage());
        }

        if(user.getWeight() <= 0.0) {
            throw new UserNotValidException(ErrorMessages.INVALID_WEIGHT.getMessage());
        }

        if(user.getHeight() <= 0.0) {
            throw new UserNotValidException(ErrorMessages.INVALID_HEIGHT.getMessage());
        }
    }
}
