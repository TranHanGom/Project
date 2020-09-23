package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
public class MainController {
	@Autowired
	private UserService userService;

	@GetMapping("/index")
	public String login(Model model) {
		return "index";
	}

	 @RequestMapping(value="/admin", method = RequestMethod.GET)
	    public List listUser(){
	        return userService.findAll();
	    }
}
