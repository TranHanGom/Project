package com.example.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.example.entity.Role;
import com.example.entity.User;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import java.util.HashSet;
import java.util.Set;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void save(User user) {
		user.setPassword((user.getPassword()));
		//user.setRole(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);
	}

	@Override
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 User user = userRepository.findByUsername(username)    
	                .orElseThrow(() -> new UsernameNotFoundException("User: " + username + " not found"));    
	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),    
	                Arrays.asList(new SimpleGrantedAuthority("user")));
	        
	//	User user = userRepository.findByUsername(username);
//		if (user == null)
//			throw new UsernameNotFoundException(username);
//
//		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
////		        for (Role role : user.getRoles()){
////		            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
////		        }
//
//		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//				grantedAuthorities);
	}

	@Override
	public Optional<User> findByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	
}
