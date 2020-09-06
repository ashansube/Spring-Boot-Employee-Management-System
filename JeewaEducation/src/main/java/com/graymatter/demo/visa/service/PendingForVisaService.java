package com.graymatter.demo.visa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.visa.dao.PendingForVisaRepo;
import com.graymatter.demo.visa.model.PendingForVisa;

@Service
public class PendingForVisaService {

	@Autowired
	PendingForVisaRepo repo;
	
	public void submitVisaApplicationForm(PendingForVisa penvisa) {
		repo.save(penvisa);
	}
	
}
