package com.graymatter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("student")
	public void addStudent(@ModelAttribute("student") Student student) {
		service.addStudent(student);
	}
	
}
