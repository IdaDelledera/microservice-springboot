package com.loginregistration.repository;

import com.loginregistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
