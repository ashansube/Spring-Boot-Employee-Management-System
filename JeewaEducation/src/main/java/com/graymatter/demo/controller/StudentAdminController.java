package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentAdminController {

	@GetMapping("/admin/student-dashboard")
	public String studentDash() {
		return "student/student_dashboard";
	}
	
}
