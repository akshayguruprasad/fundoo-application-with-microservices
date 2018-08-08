package com.indream.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.indream.userservice.model.UserEntity;

/**
 * user custom repository method
 * 
 * @author Akshay
 *
 */
@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
	UserEntity getByEmail(String email);
}