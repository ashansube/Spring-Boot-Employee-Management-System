package com.graymatter.demo.employee.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Branches {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Branch_ID;
	
	private String Branch_Name;
	private String Branch_Address;
	private String Branch_Email;
	private String Branch_Phone_No;
	
	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "bran_id", referencedColumnName = "Branch_ID")
	private List<Employee> employee;
	
	
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getBranch_ID() {
		return Branch_ID;
	}
	public void setBranch_ID(int branch_ID) {
		Branch_ID = branch_ID;
	}
	public String getBranch_Name() {
		return Branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;
	}
	public String getBranch_Address() {
		return Branch_Address;
	}
	public void setBranch_Address(String branch_Address) {
		Branch_Address = branch_Address;
	}
	public String getBranch_Email() {
		return Branch_Email;
	}
	public void setBranch_Email(String branch_Email) {
		Branch_Email = branch_Email;
	}
	public String getBranch_Phone_No() {
		return Branch_Phone_No;
	}
	public void setBranch_Phone_No(String branch_Phone_No) {
		Branch_Phone_No = branch_Phone_No;
	}
	
	
	@Override
	public String toString() {
		return "Branches [Branch_ID=" + Branch_ID + ", Branch_Name=" + Branch_Name + ", Branch_Address="
				+ Branch_Address + ", Branch_Email=" + Branch_Email + ", Branch_Phone_No=" + Branch_Phone_No
				+ ", employee=" + employee + "]";
	}
	
	
	
}
