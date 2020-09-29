package com.example.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.entity.User;

public interface IService  extends UserDetailsService{
    User findByUsername(String username);

	List<User> findAllUsers();

	
}