package com.example.tracableai.service;

import com.example.tracableai.model.User;
import java.util.List;


public interface UserService {
    User createUser(User user);

    List<User> getUsers();

    User getUserById(long id);

}
