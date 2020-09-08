package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.graymatter.demo.model.CompanyExpences;
import com.graymatter.demo.service.CompanyExpencesService;

@Controller
public class CompanyExpenesController {
	
	@Autowired
	CompanyExpencesService service;
	
	@PostMapping(value = "/addexpences")
	public String addexpences(CompanyExpences companyExpences) {
		service.addexpences(companyExpences);
		return "payment/paymentIncomeList";
	}
}
