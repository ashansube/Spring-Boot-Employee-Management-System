package com.graymatter.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graymatter.demo.model.VisaStudent;
import com.graymatter.demo.service.VisaStudentService;

@Controller
public class VisaProfileController {

	@Autowired
	VisaStudentService service;
	
	@GetMapping("/profile/visaprofile_01")
	public String visaprofile01() {
		
		System.out.println(service.cheackLogin("abc", "abc"));
		
		return "visa/profile/visaprofile_01";
	}
	
	@GetMapping("/profile/visaprofile_02")
	public String visaprofile02() {
		return "visa/profile/visaprofile_02";
	}
	

	@GetMapping("/profile/visaprofile_03")
	public String visaprofile03() {
		return "visa/profile/visaprofile_03";
	}
	
	@GetMapping("/profile/submitvisaapplication")
	public String visaapplicationsubmit() {
		return "visa/profile/submit_visa_application";
	}
	
	@GetMapping("/profile/visa")
	public String visaProfileLogin() {
		return "visa/profile/visa_profile_login";
	}
	
	@RequestMapping("/profile/visa_login")
	public void loginAuthentication(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		HttpSession session = req.getSession();
		
		String name = req.getParameter("username");
		String psw = req.getParameter("password");
		
		if(service.cheackLogin(name, psw)!=null) {
			
			//String visaid = service.findByUserName(name).getId();
			
			session.setAttribute("visauserid", service.cheackLogin(name, psw).getId());
			
			res.sendRedirect("/profile/visaprofile_01");
			
		}else {
			res.sendRedirect("/profile/visa");
		}
		
	}
	
	
}
