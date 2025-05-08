package com.diet_info.dietInfo.user.services;

import com.diet_info.dietInfo.user.exceptions.ErrorMessages;
import com.diet_info.dietInfo.user.exceptions.UserNotFoundException;
import com.diet_info.dietInfo.user.exceptions.UserNotValidException;
import com.diet_info.dietInfo.user.model.UpdateUserCommand;
import com.diet_info.dietInfo.user.model.User;
import com.diet_info.dietInfo.user.model.UserDTO;
import com.diet_info.dietInfo.user.repository.UserRepository;
import com.diet_info.dietInfo.user.validators.UserValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<List<UserDTO>> getUsers() {
        List<User> users = userRepository.findAll();

        List<UserDTO> userDTOS = users.stream().map(UserDTO::new).toList();

        return ResponseEntity.status(HttpStatus.OK).body(userDTOS);
    }

    public ResponseEntity<UserDTO> getUserById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            return ResponseEntity.ok(new UserDTO(userOptional.get()));
        }

        throw new UserNotFoundException(ErrorMessages.USER_NOT_FOUND.getMessage());
    }

    public ResponseEntity<UserDTO> postUsers(User user) {

        UserValidator.isValid(user);

        User saveUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new UserDTO(saveUser));
    }

    public ResponseEntity<UserDTO> putUsers(UpdateUserCommand command) {
        Optional<User> userOptional = userRepository.findById(command.getId());

        if (userOptional.isPresent()) {
            User user = command.getUser();
            user.setId(command.getId());

            UserValidator.isValid(user);

            userRepository.save(user);

            return ResponseEntity.ok(new UserDTO(user));
        }

        throw new UserNotFoundException(ErrorMessages.USER_NOT_FOUND.getMessage());
    }

    public ResponseEntity<Void> deleteUsers(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            userRepository.deleteById(id);

            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        throw new UserNotFoundException(ErrorMessages.USER_NOT_FOUND.getMessage());
    }
}
