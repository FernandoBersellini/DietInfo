package com.diet_info.dietInfo.user.controller;

import com.diet_info.dietInfo.user.model.UpdateUserCommand;
import com.diet_info.dietInfo.user.model.User;
import com.diet_info.dietInfo.user.model.UserDTO;
import com.diet_info.dietInfo.user.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<UserDTO>> getUsersMethod() {
        return userService.getUsers();
    }

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<UserDTO> getUserByIdMethod(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping("/createUsers")
    public ResponseEntity<UserDTO> postUsersMethod(@RequestBody User user) {
        return userService.postUsers(user);
    }

    @PutMapping("/updateUsers/{id}")
    public ResponseEntity<UserDTO> putUsersMethod(@PathVariable Integer id, @RequestBody User user) {
        return userService.putUsers(new UpdateUserCommand(id, user));
    }

    @DeleteMapping("/deleteUsers/{id}")
    public ResponseEntity<Void> deleteUsersMethod(@PathVariable Integer id) {
        return userService.deleteUsers(id);
    }
}
