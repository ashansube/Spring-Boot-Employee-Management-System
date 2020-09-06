package com.graymatter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.PendingForVisa;
import com.graymatter.demo.repo.PendingForVisaRepo;

@Service
public class PendingForVisaService {

	@Autowired
	PendingForVisaRepo repo;
	
	public void submitVisaApplycation(PendingForVisa pendingVisa) {
		repo.save(pendingVisa);
	}
	
}
