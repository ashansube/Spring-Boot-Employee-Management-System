package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
/*
	@GetMapping("/admin-visa/Dashboard")
	public String Dashboard() {
		return "admin/visa/visa_dashboard";
	}
	*/
	
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
}
