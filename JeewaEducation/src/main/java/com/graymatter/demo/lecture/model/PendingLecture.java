package com.graymatter.demo.lecture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PendingLecture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pendingLecturer_ID;
	
	private String Full_Name;
	private String Name_Initial;
	private String Address;
	private String Email;
	private String Gender;
	private String Mobile_No;
	private String NIC;
	
	
	public int getPendingLecturer_ID() {
		return pendingLecturer_ID;
	}
	public void setPendingLecturer_ID(int pendingLecturer_ID) {
		this.pendingLecturer_ID = pendingLecturer_ID;
	}
	public String getFull_Name() {
		return Full_Name;
	}
	public void setFull_Name(String full_Name) {
		Full_Name = full_Name;
	}
	public String getName_Initial() {
		return Name_Initial;
	}
	public void setName_Initial(String name_Initial) {
		Name_Initial = name_Initial;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	
	@Override
	public String toString() {
		return "PendingLecture [pendingLecturer_ID=" + pendingLecturer_ID + ", Full_Name=" + Full_Name
				+ ", Name_Initial=" + Name_Initial + ", Address=" + Address + ", Email=" + Email + ", Gender=" + Gender
				+ ", Mobile_No=" + Mobile_No + ", NIC=" + NIC + "]";
	}
	
	
	
}
