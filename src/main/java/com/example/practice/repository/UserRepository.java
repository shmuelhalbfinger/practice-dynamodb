package com.example.practice.repository;

import com.example.practice.entity.UserEntity;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface UserRepository extends CrudRepository<UserEntity, String> {

}
