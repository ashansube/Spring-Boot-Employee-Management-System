package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.demo.model.PendingForVisa;
import com.graymatter.demo.service.PendingForVisaService;

@Controller
public class PendingForVisaController {

	@Autowired
	PendingForVisaService service;
	
	@PostMapping(value = "/profile/pendingvisa")
	public String submitVisaApplication(PendingForVisa pendingVisa) {
		service.submitVisaApplycation(pendingVisa);
		return "visa/profile/submit_visa_application";
	}
	
}
