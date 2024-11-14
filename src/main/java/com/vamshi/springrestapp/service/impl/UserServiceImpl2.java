package com.vamshi.springrestapp.service.impl;

import com.vamshi.springrestapp.entity.User;
import com.vamshi.springrestapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service("Impl2")
@AllArgsConstructor
public class UserServiceImpl2 {
        private UserRepository userRepo;
        public User createUser(User user)
        {
            System.out.println("UserServiceImpl2");
            return userRepo.saveAndFlush(user);
        }
    }
