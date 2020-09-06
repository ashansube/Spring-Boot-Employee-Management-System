package com.graymatter.demo.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoundationStudent {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Foundation_Id;
	
	private String NIC;
	private String NameWithInitials;
	private String FullName;
	private String Address;
	private String phone_no;
	private String email;
	public int getFoundation_Id() {
		return Foundation_Id;
	}
	public void setFoundation_Id(int foundation_Id) {
		Foundation_Id = foundation_Id;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getNameWithInitials() {
		return NameWithInitials;
	}
	public void setNameWithInitials(String nameWithInitials) {
		NameWithInitials = nameWithInitials;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "FoundationStudent [Foundation_Id=" + Foundation_Id + ", NIC=" + NIC + ", NameWithInitials="
				+ NameWithInitials + ", FullName=" + FullName + ", Address=" + Address + ", phone_no=" + phone_no
				+ ", email=" + email + "]";
	}
	
	
	

	
	
}
