package com.diet_info.dietInfo.user.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public ResponseEntity<String> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body("This is the GET method");
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
