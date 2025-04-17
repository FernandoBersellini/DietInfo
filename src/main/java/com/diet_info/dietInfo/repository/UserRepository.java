package com.diet_info.dietInfo.repository;

import com.diet_info.dietInfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
