package com.vamshi.springrestapp.UserMapper;

import com.vamshi.springrestapp.dto.UserDto;
import com.vamshi.springrestapp.entity.User;

public class UserMapper {

    public static User userDtoToUser(UserDto userDto)
    {
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        return user;
    }

    public static UserDto userToUserDto(User user)
    {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
