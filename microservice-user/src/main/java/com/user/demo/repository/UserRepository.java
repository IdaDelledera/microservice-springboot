package com.user.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.user.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	List<User> findAll();
}
