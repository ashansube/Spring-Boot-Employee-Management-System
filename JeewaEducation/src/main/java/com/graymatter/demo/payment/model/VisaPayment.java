package com.graymatter.demo.payment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisaPayment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Visa_Payment_ID;
	
	private String Student_Name;
	private String Deposited_Amount;
	private String Date;
	private String Bank;
	private String Branch;
	private String Payment_Slip;
	
	
	public int getVisa_Payment_ID() {
		return Visa_Payment_ID;
	}
	public void setVisa_Payment_ID(int visa_Payment_ID) {
		Visa_Payment_ID = visa_Payment_ID;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getDeposited_Amount() {
		return Deposited_Amount;
	}
	public void setDeposited_Amount(String deposited_Amount) {
		Deposited_Amount = deposited_Amount;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getPayment_Slip() {
		return Payment_Slip;
	}
	public void setPayment_Slip(String payment_Slip) {
		Payment_Slip = payment_Slip;
	}
	
	
	@Override
	public String toString() {
		return "VisaPayment [Visa_Payment_ID=" + Visa_Payment_ID + ", Student_Name=" + Student_Name
				+ ", FoundationBatchPaymentDeposited_Amount=" + Deposited_Amount + ", Date=" + Date + ", Bank=" + Bank + ", Branch=" + Branch
				+ ", Payment_Slip=" + Payment_Slip + "]";
	}
	
	

}
