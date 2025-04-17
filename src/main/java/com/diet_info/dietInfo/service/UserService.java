package com.diet_info.dietInfo.service;

import com.diet_info.dietInfo.entity.User;
import com.diet_info.dietInfo.repository.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> createUser(User user) {
        userRepository.save(user);
        return listUser();
    }

    public List<User> listUser() {
        Sort sort = Sort.by("username").descending();
//        userRepository.findAll(sort);
        return userRepository.findAll(Sort.by("username").descending());

    }

    public List<User> updateUser(User user) {
        userRepository.save(user);
        return listUser();
    }

    public List<User> deleteUser(Long id) {
        userRepository.deleteById(id);
        return listUser();
    }


}
