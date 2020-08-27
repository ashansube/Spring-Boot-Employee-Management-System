package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisaProfileController {

	@RequestMapping("/profile/visa-profile01")
	public String VisaProfile_1() {
		return "visa/profile/visa_student_profile_01";
	}
	
}
