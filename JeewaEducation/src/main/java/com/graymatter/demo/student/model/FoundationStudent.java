package com.graymatter.demo.student.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.graymatter.demo.payment.model.FoundationBatchPayment;
import com.graymatter.demo.payment.model.VisaPayment;

@Entity
public class FoundationStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foun_id;
	
	private String NIC;
	private String name_with_ini;
	private String fullName;
	private String address;
	private String Phone_Num;
	private String email;
	

	@OneToMany(targetEntity = FoundationBatchPayment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "st_id_fk", referencedColumnName = "foun_id")
	private List<FoundationBatchPayment> batch_pay;
	
	public List<FoundationBatchPayment> getBatch_pay() {
		return batch_pay;
	}
	public void setBatch_pay(List<FoundationBatchPayment> batch_pay) {
		this.batch_pay = batch_pay;
	}
	public int getFoun_id() {
		return foun_id;
	}
	public void setFoun_id(int foun_id) {
		this.foun_id = foun_id;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getName_with_ini() {
		return name_with_ini;
	}
	public void setName_with_ini(String name_with_ini) {
		this.name_with_ini = name_with_ini;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_Num() {
		return Phone_Num;
	}
	public void setPhone_Num(String phone_Num) {
		Phone_Num = phone_Num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "FoundationStudent [foun_id=" + foun_id + ", NIC=" + NIC + ", name_with_ini=" + name_with_ini
				+ ", fullName=" + fullName + ", address=" + address + ", Phone_Num=" + Phone_Num + ", email=" + email
				+ ", batch_pay=" + batch_pay + "]";
	}
	
	
	
}
