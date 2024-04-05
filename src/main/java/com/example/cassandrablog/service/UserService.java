package com.example.cassandrablog.service;

import com.example.cassandrablog.payload.UserDto;

import java.util.List;

public interface UserService {

    public UserDto createUser(UserDto userDto);
    public List<UserDto> getAllUsers();
    public UserDto getUserById(Long id);
    public UserDto updateUser(Long id, UserDto userDto);
    public void deleteUser(Long id);
}
