package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.graymatter.demo.model.Employee;
import com.graymatter.demo.service.EmployeeService;
import com.graymatter.demo.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
	
	
	@PostMapping("/admin/employee")
	public String addEmployee(Employee employee) {
		
		service.saveEmployee(employee);
		
		return "redirect:/admin/employee-datatable";
		
	}

	@GetMapping("/admin/viewEmployee")
	public String viewEmployee(@RequestParam int id, Model model) {
		
		Employee employee = service.getEmployeeById(id);
		
		model.addAttribute("employee", employee);
		
		return "employee/view_employee";
	}
	
	@RequestMapping("/admin/deleteEmployee")
	public String deleteEmployee(@RequestParam int id) {
		
		service.deleteEmployeeById(id);
		return "redirect:/admin/employee-datatable";
	}
	
	
}
