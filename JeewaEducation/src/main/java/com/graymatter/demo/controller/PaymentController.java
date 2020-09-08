package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.demo.model.CompanyExpences;
import com.graymatter.demo.repo.CompanyExpencesRepo;

@Controller
public class PaymentController {
	
	
	@RequestMapping("/admin/payment-dashboard")
	public String Payment_dashboard() {
		return "payment/paymentDashboard";
	}
	
	
	@RequestMapping("/admin/payment-FoundationBatch")
	public String Payment_fb() {
		return "payment/paymentFB";
	}
	
	@RequestMapping("/admin/payment-VISA")
	public String Payment_visa() {
		return "payment/paymentVISA";
	}
	
	@RequestMapping("/admin/payment-Income-List")
	public String Payment_income_list() {
		return "payment/paymentIncomeList";
	}
	
	@RequestMapping("/admin/payment-Expences-List")
	public String Payment_expences_list() {
		return "payment/paymentExpencesList";
	}
	
	@RequestMapping("/admin/payment-report")
	public String Payment_report() {
		return "payment/paymentReport";
	}
	 
	@RequestMapping("/admin/payment-expences-AUD")
	public String Payment_expences_aud() {
		return "payment/paymentExpencesAUD";
	}
	
	@RequestMapping("/admin/payment-income-AUD")
	public String Payment_income_aud() {
		return "payment/paymentIncomeAUD";
	}
	
	@RequestMapping("/payment-form-VISA")
	public String Payment_front_visa() {
		return "payment/paymentFrontVISA";
	}
	
	@RequestMapping("/payment-form-Foundation-Batch")
	public String Payment_front_fb() {
		return "payment/paymentFrontFB";
	}
	
	@RequestMapping("/payment-summery")
	public String Payment_front_summery() {
		return "payment/paymentSummery";
	}
}


