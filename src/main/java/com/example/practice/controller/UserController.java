package com.example.practice.controller;

import com.example.practice.entity.UserEntity;
import com.example.practice.mapper.UserMapper;
import com.example.practice.model.User;
import com.example.practice.repository.UserRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/user")
    public List<User> viewAllUsers() {
        List<UserEntity> userEntities = Lists.newArrayList(userRepository.findAll());
        return userEntities.stream().map(userMapper::mapToUser).collect(Collectors.toList());
    }

    @PostMapping(value = "/user")
    public User createUser(@RequestBody User user) {
        return userMapper.mapToUser(userRepository.save(userMapper.mapToUserEntity(user)));
    }
}
