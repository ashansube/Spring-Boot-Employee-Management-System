package com.graymatter.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	/*
	@GetMapping(value = "/admin/visa-pendingstudents")
	public String listAllPendingVisa(HttpServletRequest req) {
		
		List<PendingForVisa> listPendingVisa = service.listAllPendingVisa();
		
		req.setAttribute("pendingvisa", listPendingVisa);
		
		return "visa/visa_pending_student";
	}
	*/
	
}
