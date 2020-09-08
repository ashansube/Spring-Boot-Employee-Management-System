package com.graymatter.demo.service;

import java.util.List;

import com.graymatter.demo.model.Employee;

public interface EmployeeService {	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	void deleteEmployeeById(int id);
}
