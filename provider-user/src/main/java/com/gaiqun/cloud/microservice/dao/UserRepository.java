package com.gaiqun.cloud.microservice.dao;

import com.gaiqun.cloud.microservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author gaiqun
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
