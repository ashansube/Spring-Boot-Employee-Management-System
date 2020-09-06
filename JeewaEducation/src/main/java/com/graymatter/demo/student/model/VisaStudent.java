package com.graymatter.demo.student.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.graymatter.demo.visa.model.PendingForVisa;


@Entity
public class VisaStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int visa_std_id;
	
	private String NIC;
	private String name_with_ini;
	private String fullName;
	private String address;
	private String Phone_Num;
	private String email;
	
	public int getVisa_std_id() {
		return visa_std_id;
	}
	public void setVisa_std_id(int visa_std_id) {
		this.visa_std_id = visa_std_id;
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
		return "VisaStudent [visa_std_id=" + visa_std_id + ", NIC=" + NIC + ", name_with_ini=" + name_with_ini
				+ ", fullName=" + fullName + ", address=" + address + ", Phone_Num=" + Phone_Num + ", email=" + email
				+ "]";
	}

	
}
