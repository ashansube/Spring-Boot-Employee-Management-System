package com.graymatter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.User;
import com.graymatter.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	public void addUser(User user) {
		repo.save(user);	
	}
	
}
