package com.pranjalgoyal.service;

import com.pranjalgoyal.model.User;
import com.pranjalgoyal.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
