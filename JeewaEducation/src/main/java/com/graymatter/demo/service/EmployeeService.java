package com.graymatter.demo.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.graymatter.demo.model.Employee;

import net.sf.jasperreports.engine.JRException;

public interface EmployeeService {	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	void deleteEmployeeById(int id);
	String exportReport(String format) throws FileNotFoundException, JRException;
}
