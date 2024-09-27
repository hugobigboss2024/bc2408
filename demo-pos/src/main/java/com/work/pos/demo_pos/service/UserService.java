package com.work.pos.demo_pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByID(Long id) {
        return userRepository.findByID(id).orElse(null);
    }
}
