package com.vamshi.springrestapp.service.impl;

import com.vamshi.springrestapp.entity.User;
import com.vamshi.springrestapp.repository.UserRepository;
import com.vamshi.springrestapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Impl1")
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    public User createUser(User user)
    {
        System.out.println("UserServiceImpl1");
        return userRepo.save(user);
    }
}
