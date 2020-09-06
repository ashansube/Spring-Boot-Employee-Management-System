package com.graymatter.demo.visa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import com.graymatter.demo.student.model.PendingStudent;
import com.graymatter.demo.student.model.VisaStudent;


@Entity
public class PendingForVisa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String fname;
	private String lname;
	private String OtherName;
	private String SEX;
	private String DOB;
	private String city;
	private String state;
	private int zip;
	private String Current_Martial_Status;
	private String Country_of_Current_Resident;
	private String email;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pendingStudent_FK")
	private PendingStudent pendingStudent;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PendingStudent getPendingStudent() {
		return pendingStudent;
	}
	public void setPendingStudent(PendingStudent pendingStudent) {
		this.pendingStudent = pendingStudent;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getOtherName() {
		return OtherName;
	}
	public void setOtherName(String otherName) {
		OtherName = otherName;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public String getCurrent_Martial_Status() {
		return Current_Martial_Status;
	}
	public void setCurrent_Martial_Status(String current_Martial_Status) {
		Current_Martial_Status = current_Martial_Status;
	}
	public String getCountry_of_Current_Resident() {
		return Country_of_Current_Resident;
	}
	public void setCountry_of_Current_Resident(String country_of_Current_Resident) {
		Country_of_Current_Resident = country_of_Current_Resident;
	}
	@Override
	public String toString() {
		return "PendingForVisa [id=" + id + ", fname=" + fname + ", lname=" + lname + ", OtherName=" + OtherName
				+ ", SEX=" + SEX + ", DOB=" + DOB + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", Current_Martial_Status=" + Current_Martial_Status + ", Country_of_Current_Resident="
				+ Country_of_Current_Resident + ", email=" + email + ", pendingStudent=" + pendingStudent + "]";
	}
	
	

	
	
}
