package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.entity.User;

public interface UserService extends UserDetailsService {
	Optional<User> findByUserName(String username);

	void save(User user);

	public List<User> findAll();

}
