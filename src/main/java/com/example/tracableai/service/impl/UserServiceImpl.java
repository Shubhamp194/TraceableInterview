package com.example.tracableai.service.impl;

import com.example.tracableai.exception.ResourceNotFoundException;
import com.example.tracableai.model.User;
import com.example.tracableai.repository.UserRepository;
import com.example.tracableai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User with id : "+id+" does not exist"));
    }

}
