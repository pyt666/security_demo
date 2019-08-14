package com.example.security_demo.repo;

import com.example.security_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author pyt
 * @Date 2019/8/14 16:42
 * @Version
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
