package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.graymatter.demo.model.PendingStudents;

import com.graymatter.demo.service.PendingStudentsService;

@Controller
public class PendingStudentsController {
	
	@Autowired
	PendingStudentsService service;
	
	@PostMapping(value = "/submitdetails")
	public String addStudents(PendingStudents pendingstudents) {
		service.addStudents(pendingstudents);
		return "home";
		
	}
	

}
