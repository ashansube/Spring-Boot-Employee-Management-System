package com.graymatter.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "dphone_number")
	private String dphoneNo;
	
	@Column(name = "department_email")
	private String departmentEmail;
	
	@Column(name = "department_branch")
	private String department_branch;
	
	@Column(name = "department_address")
	private String department_address;
	
	@Column(name = "department_ententionNo")
	private String department_ententionNo;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDphoneNo() {
		return dphoneNo;
	}

	public void setDphoneNo(String dphoneNo) {
		this.dphoneNo = dphoneNo;
	}

	public String getDepartmentEmail() {
		return departmentEmail;
	}

	public void setDepartmentEmail(String departmentEmail) {
		this.departmentEmail = departmentEmail;
	}

	public String getDepartment_branch() {
		return department_branch;
	}

	public void setDepartment_branch(String department_branch) {
		this.department_branch = department_branch;
	}

	public String getDepartment_address() {
		return department_address;
	}

	public void setDepartment_address(String department_address) {
		this.department_address = department_address;
	}

	public String getDepartment_ententionNo() {
		return department_ententionNo;
	}

	public void setDepartment_ententionNo(String department_ententionNo) {
		this.department_ententionNo = department_ententionNo;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", dphoneNo=" + dphoneNo
				+ ", departmentEmail=" + departmentEmail + ", department_branch=" + department_branch
				+ ", department_address=" + department_address + ", department_ententionNo=" + department_ententionNo
				+ "]";
	}
	


}
