package com.diet_info.dietInfo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.diet_info.dietInfo.user.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
