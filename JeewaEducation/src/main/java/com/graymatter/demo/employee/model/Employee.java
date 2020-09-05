package com.graymatter.demo.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Employee_ID;
	
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String NIC;
	private String Mobile_No;
	private String Address;
	private String Gender;
	private String Birth_Date;
	private String Joined_Date;
	private String Position;
	
	
	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBirth_Date() {
		return Birth_Date;
	}
	public void setBirth_Date(String birth_Date) {
		Birth_Date = birth_Date;
	}
	public String getJoined_Date() {
		return Joined_Date;
	}
	public void setJoined_Date(String joined_Date) {
		Joined_Date = joined_Date;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	
	@Override
	public String toString() {
		return "Employee [Employee_ID=" + Employee_ID + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Email=" + Email + ", NIC=" + NIC + ", Mobile_No=" + Mobile_No + ", Address=" + Address
				+ ", Gender=" + Gender + ", Birth_Date=" + Birth_Date + ", Joined_Date=" + Joined_Date + ", Position="
				+ Position + "]";
	}
	
	
	
}
