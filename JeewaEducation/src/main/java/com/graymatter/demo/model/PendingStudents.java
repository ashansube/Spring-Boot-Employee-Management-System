package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PendingStudents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pending_id;
	
	private String NameWithInitials;
	private String FullName;
	private String HomeAddress;
	private String nic;
	private String DegreeProgram;
	private String TelHome;
	private String TelMobile;
	
	private String FatherName;
	private String FatherNIC;
	private String FatherOccupation;
	
	private String MotherName;
	private String MotherNIC;
	private String MotherOccupation;
	public int getPending_id() {
		return pending_id;
	}
	public void setPending_id(int pending_id) {
		this.pending_id = pending_id;
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
	public String getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}

	public String getDegreeProgram() {
		return DegreeProgram;
	}
	public void setDegreeProgram(String degreeProgram) {
		DegreeProgram = degreeProgram;
	}
	public String getTelHome() {
		return TelHome;
	}
	public void setTelHome(String telHome) {
		TelHome = telHome;
	}
	public String getTelMobile() {
		return TelMobile;
	}
	public void setTelMobile(String telMobile) {
		TelMobile = telMobile;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getFatherNIC() {
		return FatherNIC;
	}
	public void setFatherNIC(String fatherNIC) {
		FatherNIC = fatherNIC;
	}
	public String getFatherOccupation() {
		return FatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		FatherOccupation = fatherOccupation;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getMotherNIC() {
		return MotherNIC;
	}
	public void setMotherNIC(String motherNIC) {
		MotherNIC = motherNIC;
	}
	public String getMotherOccupation() {
		return MotherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		MotherOccupation = motherOccupation;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	@Override
	public String toString() {
		return "PendingStudents [pending_id=" + pending_id + ", NameWithInitials=" + NameWithInitials + ", FullName="
				+ FullName + ", HomeAddress=" + HomeAddress + ", nic=" + nic + ", DegreeProgram=" + DegreeProgram
				+ ", TelHome=" + TelHome + ", TelMobile=" + TelMobile + ", FatherName=" + FatherName + ", FatherNIC="
				+ FatherNIC + ", FatherOccupation=" + FatherOccupation + ", MotherName=" + MotherName + ", MotherNIC="
				+ MotherNIC + ", MotherOccupation=" + MotherOccupation + "]";
	}

	

	
	

}
