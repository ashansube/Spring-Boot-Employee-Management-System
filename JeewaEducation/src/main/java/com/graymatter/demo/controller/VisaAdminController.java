package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisaAdminController {

	@RequestMapping("/admin/visa")
	public String VisaAdminLogin() {
		return "visa/visa_admin_login";
	}
	
	@RequestMapping("/admin/visa-dashboard")
	public String VisaAdminDashboard() {
		return "visa/visa_dashboard";
	}
	
	@RequestMapping("/admin/visa-pendingstudents")
	public String VisaPendingStudent() {
		return "visa/visa_pending_student";
	}
	
}

//Ashan