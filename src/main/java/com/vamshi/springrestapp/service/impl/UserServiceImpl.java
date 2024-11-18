package com.vamshi.springrestapp.service.impl;

import com.vamshi.springrestapp.UserMapper.UserMapper;
import com.vamshi.springrestapp.dto.UserDto;
import com.vamshi.springrestapp.entity.User;
import com.vamshi.springrestapp.exception.UserNotFoundException;
import com.vamshi.springrestapp.repository.UserRepository;
import com.vamshi.springrestapp.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("Impl1")
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDto createUser(UserDto userDto)
    {
        System.out.println("UserServiceImpl1");
        //User user = UserMapper.userDtoToUser(userDto);
        User user = modelMapper.map(userDto, User.class);
        userRepo.save(user);
        //return UserMapper.userToUserDto(user);
        return modelMapper.map(user, UserDto.class);
    }

    public UserDto fetchUserByIdMethod(Long id)
    {
        System.out.println("FetchUserById method");

        User user = userRepo.findById(id).orElseThrow(
                () -> new UserNotFoundException("User","id",id)
        );
        return modelMapper.map(user, UserDto.class);
    }

    public List<UserDto> getAllUsers()
    {
        System.out.println("GetAllUsers Method");
        List<User> fetchedUsers = userRepo.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        fetchedUsers.stream()
                .map(user -> UserMapper.userToUserDto(user))
                .forEach((user) -> userDtos.add(user));
        return userDtos;
    }

    public UserDto updateUser(UserDto userDto)
    {
        System.out.println("UpdateUser Method");
        User existingUser = userRepo.findById(userDto.getId()).orElseThrow(
                () -> new UserNotFoundException("User","id",userDto.getId())
        );
        UserDto existinguserDto = UserMapper.userToUserDto(existingUser);
        existinguserDto.setFirstName(userDto.getFirstName());
        existinguserDto.setLastName(userDto.getLastName());
        existinguserDto.setEmail(userDto.getEmail());
        User updatedUser = userRepo.save(UserMapper.userDtoToUser(existinguserDto));
        return UserMapper.userToUserDto(updatedUser);
    }

    public void deleteUserById(Long id)
    {
        System.out.println("DeleteUserByID Method");
        userRepo.deleteById(id);
    }
}
