package com.diet_info.dietInfo.user.services;

import com.diet_info.dietInfo.user.Command;
import com.diet_info.dietInfo.user.model.User;
import com.diet_info.dietInfo.user.model.UserDTO;
import com.diet_info.dietInfo.user.repository.UserRepository;
import org.hibernate.loader.NonUniqueDiscoveredSqlAliasException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public ResponseEntity<String> postUsers() {
        return ResponseEntity.status(HttpStatus.CREATED).body("This is the POST method");
    }

    public ResponseEntity<String> putUsers() {
        return ResponseEntity.status(HttpStatus.OK).body("This is the PUT method");
    }

    public ResponseEntity<String> deleteUsers() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
