package com.codegym.demo.service;

import com.codegym.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    void save(User user);

    Iterable<User> findAll();

    User findByUsername(String username);

    Optional<User> findById(Long id);

    boolean checkLogin(User user);

    User findByEmail(String email);

    boolean isCorrectConfirmPassword(User user);
}
