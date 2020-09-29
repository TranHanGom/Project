package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.IService;
import com.example.service.UserServiceImpl;

@RestController
@RequestMapping("/example")
public class MainController {
	@Autowired
	private TokenEndpoint tokenEndpoint;

	@Autowired
	private TokenStore tokenStore;

	@Autowired
	private IService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public List<User> getUsers() {
		return userService.findAllUsers();

	}

}
