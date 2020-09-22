package com.example.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.entity.User;

public interface UserService extends UserDetailsService {
	User findByUserName(String username);
}
