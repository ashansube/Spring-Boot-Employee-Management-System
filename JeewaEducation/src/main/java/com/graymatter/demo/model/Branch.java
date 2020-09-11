package com.graymatter.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branches")
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "branch_name")
	private String branchName;
	
	@Column(name = "bphone_number")
	private String bphoneNo;
	
	@Column(name = "branch_email")
	private String branchEmail;
	
	@Column(name = "branch_location")
	private String branchLocation;
	
	@Column(name = "branch_address")
	private String branchAddress;
	
	@Column(name = "branch_pCode")
	private String branchPCode;
	
	@Column(name = "branch_faxNo")
	private String baranchFaxNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBphoneNo() {
		return bphoneNo;
	}

	public void setBphoneNo(String bphoneNo) {
		this.bphoneNo = bphoneNo;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchPCode() {
		return branchPCode;
	}

	public void setBranchPCode(String branchPCode) {
		this.branchPCode = branchPCode;
	}

	public String getBaranchFaxNo() {
		return baranchFaxNo;
	}

	public void setBaranchFaxNo(String baranchFaxNo) {
		this.baranchFaxNo = baranchFaxNo;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchName=" + branchName + ", bphoneNo=" + bphoneNo + ", branchEmail="
				+ branchEmail + ", branchLocation=" + branchLocation + ", branchAddress=" + branchAddress
				+ ", branchPCode=" + branchPCode + ", baranchFaxNo=" + baranchFaxNo + "]";
	}

	
}
