package com.graymatter.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.Department;
import com.graymatter.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public void saveDepartment(Department department) {
		this.departmentRepository.save(department);
	}
		

	@Override
	public Department getDepartmentById(int id) {
		Optional<Department> optional = departmentRepository.findById(id);
		Department department = null;
		if(optional.isPresent()) {
			department = optional.get();
		}else {
			throw new RuntimeException("Department not found for id :: " + id);
		}
		return department;
	}

	@Override
	public void deleteDepartmentById(int id) {
		this.departmentRepository.deleteById(id);
		
	}

}
