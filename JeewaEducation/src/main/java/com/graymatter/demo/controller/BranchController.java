package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.graymatter.demo.model.Branch;
import com.graymatter.demo.service.BranchServiceImpl;

@Controller
public class BranchController {
	
	@Autowired
	BranchServiceImpl service;
	
	
	@PostMapping("/admin/branch")
	public String addBranch(Branch branch) {
		
		service.saveBranch(branch);
		
		return "redirect:/admin/employee-branch-table";
		
	}

	@GetMapping("/admin/viewBranch")
	public String viewBranch(@RequestParam int id, Model model) {
		
		Branch branch = service.getBranchById(id);
		service.deleteBranchById(id);
		model.addAttribute("branch", branch);	
		return "employee/view_branch";
	}
	
	
	@RequestMapping("/admin/deleteBranch")
	public String deleteBranch(@RequestParam int id) {
		
		service.deleteBranchById(id);
		return "redirect:/admin/employee-branch-table";
	}

}
