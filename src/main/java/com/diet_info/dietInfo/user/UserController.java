package com.diet_info.dietInfo.user;

import com.diet_info.dietInfo.user.model.UserDTO;
import com.diet_info.dietInfo.user.services.UserService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getUsersMethod() {
        return userService.getUsers();
    }

    @PostMapping
    public ResponseEntity<String> postUsersMethod() {
        return userService.postUsers();
    }

    @PutMapping
    public ResponseEntity<String> putUsersMethod() {
        return userService.putUsers();
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUsersMethod() {
        return userService.deleteUsers();
    }
}
