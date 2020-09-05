package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeAdminController {

	@RequestMapping("/admin/employee-dashboard")
	public String EmpDashboard() {
		return "employee/employeelist";
	}
	
}
