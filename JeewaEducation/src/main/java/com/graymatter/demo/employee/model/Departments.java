package com.graymatter.demo.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Department_ID;
	
	private String Department_Name;
	private String Department_Email;
	private String Department_EntentionNo;
	private String Department_Phone_No;
	
	
	public int getDepartment_ID() {
		return Department_ID;
	}
	public void setDepartment_ID(int department_ID) {
		Department_ID = department_ID;
	}
	public String getDepartment_Name() {
		return Department_Name;
	}
	public void setDepartment_Name(String department_Name) {
		Department_Name = department_Name;
	}
	public String getDepartment_Email() {
		return Department_Email;
	}
	public void setDepartment_Email(String department_Email) {
		Department_Email = department_Email;
	}
	public String getDepartment_EntentionNo() {
		return Department_EntentionNo;
	}
	public void setDepartment_EntentionNo(String department_EntentionNo) {
		Department_EntentionNo = department_EntentionNo;
	}
	public String getDepartment_Phone_No() {
		return Department_Phone_No;
	}
	public void setDepartment_Phone_No(String department_Phone_No) {
		Department_Phone_No = department_Phone_No;
	}
	
	
	@Override
	public String toString() {
		return "Departments [Department_ID=" + Department_ID + ", Department_Name=" + Department_Name
				+ ", Department_Email=" + Department_Email + ", Department_EntentionNo=" + Department_EntentionNo
				+ ", Department_Phone_No=" + Department_Phone_No + "]";
	}
	

}
