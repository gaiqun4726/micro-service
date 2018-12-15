package com.gaiqun.microservice.dao;

import com.gaiqun.microservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
