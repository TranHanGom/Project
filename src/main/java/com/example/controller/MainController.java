package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Content;
import com.example.service.ContentService;

@Controller
public class MainController {
	@Autowired
	private ContentService contentService;

	@GetMapping("/")
	public String root(Model model) {
		Iterable<Content> list = contentService.findAll();
		System.out.println("Logger FindAll:" + list.iterator().next().getContent());
		model.addAttribute("contents", list);
		return "index";
	}
}
