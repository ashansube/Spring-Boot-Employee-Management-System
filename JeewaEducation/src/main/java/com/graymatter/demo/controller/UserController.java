package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.demo.model.User;
import com.graymatter.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	
	
	@RequestMapping("/userpage")
	public String userpase() {
		return "userpage";
	}
	
	@PostMapping(value = "/user")
	public String addUser(User user) {
		service.addUser(user);
		return "userpage";
	}
	

	
}
