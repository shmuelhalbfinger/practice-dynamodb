package com.example.practice.mapper;

import com.example.practice.entity.UserEntity;
import com.example.practice.model.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserMapper {
    public UserEntity mapToUserEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(UUID.randomUUID().toString());
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setName(user.getName());

        return userEntity;
    }

    public User mapToUser(UserEntity userEntity) {
        User user = new User();
        user.setUsername(userEntity.getUsername());
        user.setPassword(userEntity.getPassword());
        user.setName(userEntity.getName());

        return user;
    }
}
