package com.graymatter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	
	public void addStudent(Student student) {
		repo.save(student);
	}
	
}
