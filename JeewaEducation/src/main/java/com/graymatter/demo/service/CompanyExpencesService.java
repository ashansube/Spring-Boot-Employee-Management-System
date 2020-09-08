package com.graymatter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.CompanyExpences;
import com.graymatter.demo.repo.CompanyExpencesRepo;


@Service
public class CompanyExpencesService {
	
	@Autowired
	CompanyExpencesRepo repo;
	
	public void addexpences(CompanyExpences addexpences) {
		repo.save(addexpences);
	}
	
}
