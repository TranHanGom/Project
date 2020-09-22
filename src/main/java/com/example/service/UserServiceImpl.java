package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.entity.User;
import com.example.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	 @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = userRepository.findByUserName(username);
	        if (user == null){
	            throw new UsernameNotFoundException("Invalid username or password.");
	        }
	       return null;
	    }
	
	@Override
	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(username);
	}
}
