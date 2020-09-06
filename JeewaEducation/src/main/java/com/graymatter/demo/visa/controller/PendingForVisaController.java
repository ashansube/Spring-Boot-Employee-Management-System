package com.graymatter.demo.visa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graymatter.demo.visa.model.PendingForVisa;
import com.graymatter.demo.visa.service.PendingForVisaService;

@Controller
public class PendingForVisaController {

	@Autowired
	PendingForVisaService service;
	
	@RequestMapping("submitvisa")
	public void submitApplication(@ModelAttribute("pendingforvisa") PendingForVisa penvisa) {
		service.submitVisaApplicationForm(penvisa);
	}
	
}
