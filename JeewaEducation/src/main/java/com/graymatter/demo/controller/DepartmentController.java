package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.graymatter.demo.model.Department;
import com.graymatter.demo.service.DepartmentServiceImpl;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl service;
	
	@PostMapping("/admin/department")
	public String addDepartment(Department department) {
		
		service.saveDepartment(department);
		
		return "redirect:/admin/employee-department-table";
		
	}

	@GetMapping("/admin/viewDepartment")
	public String viewDepartment(@RequestParam int id, Model model) {
		
		Department department = service.getDepartmentById(id);
		service.deleteDepartmentById(id);
		model.addAttribute("department", department);
		return "employee/view_department";
	}
	
	@RequestMapping("/admin/deleteDepartment")
	public String deleteDepartment(@RequestParam int id) {
		
		service.deleteDepartmentById(id);
		return "redirect:/admin/employee-department-table";
	}

}
