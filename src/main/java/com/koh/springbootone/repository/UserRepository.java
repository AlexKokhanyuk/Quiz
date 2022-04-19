package com.koh.springbootone.repository;

import com.koh.springbootone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
//List<User> findByLastName(String lastName);
}
