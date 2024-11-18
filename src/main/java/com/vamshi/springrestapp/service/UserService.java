package com.vamshi.springrestapp.service;


import com.vamshi.springrestapp.dto.UserDto;
import com.vamshi.springrestapp.entity.User;

import java.util.List;

public interface UserService {
    public UserDto createUser(UserDto userDto);
    public UserDto fetchUserByIdMethod(Long id);
    public List<UserDto> getAllUsers();
    public UserDto updateUser(UserDto userDto);
    public void deleteUserById(Long id);
}
