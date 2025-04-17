package com.diet_info.dietInfo.controller;

import com.diet_info.dietInfo.entity.User;
import com.diet_info.dietInfo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    List<User> create(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    List<User> list() {
        return userService.listUser();
    }

    @PutMapping
    List<User> update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("{id}")
    List<User> delete(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
