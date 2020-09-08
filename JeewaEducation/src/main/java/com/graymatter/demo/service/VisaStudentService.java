package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.VisaStudent;
import com.graymatter.demo.repo.VisaStudentRepo;

@Service
public class VisaStudentService {

	@Autowired
	VisaStudentRepo repo;
	
	public List<VisaStudent> listVisaStudent() {
		return repo.findAll();
	}
	
	public VisaStudent cheackLogin(String username, String password) {
		return repo.LoginCheack(username, password);
	}
	
	public VisaStudent findByUserName(String username) {
		return repo.findByIdByUsername(username);
	}
}
