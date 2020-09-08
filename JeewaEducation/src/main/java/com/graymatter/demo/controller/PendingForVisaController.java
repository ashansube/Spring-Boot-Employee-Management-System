package com.graymatter.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.demo.model.PendingForVisa;
import com.graymatter.demo.service.PendingForVisaService;

@Controller
public class PendingForVisaController {

	@Autowired
	PendingForVisaService service;
	
	@PostMapping(value = "/profile/pendingvisa")
	public String submitVisaApplication(PendingForVisa pendingforvisa) {
		
		service.addPendingVisa(pendingforvisa);
		
		return "redirect:/";
	}
	
	@PostMapping(value = "/admin/updatevisa")
	public String updateVisaApplication(PendingForVisa pendingforvisa) {
		
		service.addPendingVisa(pendingforvisa);
		
		return "redirect:/admin/visa-pendingstudents";
	}
	
	
	@GetMapping(value = "/admin/visa-pendinglist")
	public String listAllPendingVisa(HttpServletRequest req) {
		
		List<PendingForVisa> listpendingvisa = service.listAllPendingVisa();
		
		req.setAttribute("pendingvisa", listpendingvisa);
		
		return "visa/pendingvisa";
	}
	
	@GetMapping("/admin/visa-view")
	public String getVisaStudent() {
		return  "visa/viewvisastudent";
	}
	
	@RequestMapping(value = "/admin/pendingvisa")
	public String getPendingVisaById(@RequestParam int id, ModelMap model) {
		
		//ModelAndView mv = new ModelAndView("pendingforvisa");
		
		PendingForVisa penvisa = service.getVisaById(id);
		
		model.put("pendingvisa", penvisa);
		//req.setAttribute("pendingvisa", penvisa);
		
		//mv.addObject("pendingvisa",penvisa);
		
		return "visa/viewvisastudent";
	}
	
}
