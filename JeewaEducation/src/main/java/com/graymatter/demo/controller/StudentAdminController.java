package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentAdminController {

	@GetMapping("/admin/student-dashboard")
	public String studentDash() {
		return "student/student_dashboard";
	}
	
	@GetMapping("/student-register")
	public String register() {
		return "student/student_reg_form";
	}
	
	
	@GetMapping("/student_profile")
	public String studentprofile() {
		return "student/stud_profile";
	}
	
	@GetMapping("/view-pending-stud")
	public String viewPendingStud() {
		return "student/viewpendingstudent";
	}
	
	@GetMapping("/admin/view-foundation-stud")
	public String viewFoundationStud() {
		return "student/viewfoundationstudents";
	}
	
	@GetMapping("/admin/foundation-stud")
	public String FoundationStud() {
		return "student/foundationstudents";
	}
	
	
	@GetMapping("/pending-stud")
	public String PendingStud() {
		return "student/pendingstudents";
	}
}
