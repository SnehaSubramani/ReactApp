package com.example.User_Service.Setvice;

import com.example.User_Service.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);

    List<User> getAllUser();
}
