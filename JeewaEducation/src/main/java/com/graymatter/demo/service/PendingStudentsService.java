package com.graymatter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.PendingStudents;

import com.graymatter.demo.repo.PendingStudentsRepo;

@Service
public class PendingStudentsService {
	
	@Autowired
	PendingStudentsRepo repo;
	
	public void addStudents(PendingStudents pendingstudents) {
		repo.save(pendingstudents);	
	}

}
