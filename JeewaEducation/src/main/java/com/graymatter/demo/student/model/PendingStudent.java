package com.graymatter.demo.student.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PendingStudent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pending_ID;
	
	private String NIC;
	private String NameWithInitials;
	private String FullName;
	private String Address;
	private String phone_no;
	private String email;
	
	
	@OneToOne(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			mappedBy = "pendingstudent")
	private Parent parent; 
	

	public int getPending_ID() {
		return pending_ID;
	}

	public void setPending_ID(int pending_ID) {
		this.pending_ID = pending_ID;
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

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "PendingStudent [pending_ID=" + pending_ID + ", NIC=" + NIC + ", NameWithInitials=" + NameWithInitials
				+ ", FullName=" + FullName + ", Address=" + Address + ", phone_no=" + phone_no + ", email=" + email
				+ ", parent=" + parent + "]";
	}
	
	
}

