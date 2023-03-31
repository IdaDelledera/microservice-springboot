package com.loginregistration.service;

import com.loginregistration.model.User;
import com.loginregistration.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
     User save(UserRegistrationDto registrationDto);
}
