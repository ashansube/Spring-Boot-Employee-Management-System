package com.graymatter.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.graymatter.demo.model.VisaStudent;
import com.graymatter.demo.service.VisaStudentService;

@Controller
public class VisaStudentController {

	@Autowired
	VisaStudentService service;

	@GetMapping(value = "/admin/visa-pendingstudents")
	public String listVisaStudent(HttpServletRequest req) {
		
		List<VisaStudent> listVisaStudent = service.listVisaStudent();
		
		req.setAttribute("visastudentlist", listVisaStudent);
		
		return "visa/visa_pending_student";
	}
	
}
