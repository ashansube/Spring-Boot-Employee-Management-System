package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeAdminController {
	
	@GetMapping("/admin/employee-dashboard")
	public String employeeDash() {
		return "employee/employee_admin_dashboard";
	}
	
	@GetMapping("/admin/employee-datatable")
	public String employeeDataTable() {
		return "employee/employee_table_list";
	}
	
	@GetMapping("/admin/employee-addEmp")
	public String employeeAdd() {
		return "employee/employee_add";
	}
	
	@GetMapping("/admin/employee-department-table")
	public String departmentDataTable() {
		return "employee/department_table_list";
	}
	
	@GetMapping("/admin/employee-department-add")
	public String departmentAdd() {
		return "employee/add_department";
	}
	
	@GetMapping("/admin/employee-branch-table")
	public String branchDataTable() {
		return "employee/branch_table_list";
	}
	
	@GetMapping("/admin/employee-branch-add")
	public String branchAdd() {
		return "employee/add_branch";
	}
	
	@GetMapping("/admin/employee-view-employee")
	public String viewEmployee() {
		return "employee/view_employee";
	}
	
	@GetMapping("/admin/employee-view-department")
	public String viewDepartment() {
		return "employee/view_department";
	}
	
	@GetMapping("/admin/employee-view-branch")
	public String viewBranch() {
		return "employee/view_branch";
	}
	
	@GetMapping("/employee/employee-profile")
	public String employeeProfile() {
		return "employee/employee_profile";
	}
	
	@GetMapping("/admin/employee-admin-profile")
	public String employeeAdminProfile() {
		return "employee/employee_admin_profile";
	}
	
	@GetMapping("/admin/employee-admin-login")
	public String employeeAdminLogin() {
		return "employee/employee_admin_login";
	}
	
	
}
