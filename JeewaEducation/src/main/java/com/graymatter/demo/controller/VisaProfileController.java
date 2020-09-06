package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisaProfileController {

	@GetMapping("/profile/visaprofile_01")
	public String visaprofile01() {
		return "visa/profile/visaprofile_01";
	}
	
	@GetMapping("/profile/visaprofile_02")
	public String visaprofile02() {
		return "visa/profile/visaprofile_02";
	}
	

	@GetMapping("/profile/visaprofile_03")
	public String visaprofile03() {
		return "visa/profile/visaprofile_03";
	}
	
	@GetMapping("/profile/submitvisaapplication")
	public String visaapplicationsubmit() {
		return "visa/profile/submit_visa_application";
	}
	
	
}
