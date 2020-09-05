package com.graymatter.demo.student.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parent_id;
	
	private String FatherNIC;
	private String MotherNIC;
	private String FartherName;
	private String MotherName;
	private String FatherOccu;
	private String MotherOccu;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="st_id", nullable = false)
	private PendingStudent pendingstudent;
	

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getFatherNIC() {
		return FatherNIC;
	}

	public void setFatherNIC(String fatherNIC) {
		FatherNIC = fatherNIC;
	}

	public String getMotherNIC() {
		return MotherNIC;
	}

	public void setMotherNIC(String motherNIC) {
		MotherNIC = motherNIC;
	}

	public String getFartherName() {
		return FartherName;
	}

	public void setFartherName(String fartherName) {
		FartherName = fartherName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public String getFatherOccu() {
		return FatherOccu;
	}

	public void setFatherOccu(String fatherOccu) {
		FatherOccu = fatherOccu;
	}

	public String getMotherOccu() {
		return MotherOccu;
	}

	public void setMotherOccu(String motherOccu) {
		MotherOccu = motherOccu;
	}

	public PendingStudent getPendingstudent() {
		return pendingstudent;
	}

	public void setPendingstudent(PendingStudent pendingstudent) {
		this.pendingstudent = pendingstudent;
	}
	
	@Override
	public String toString() {
		return "Parent [parent_id=" + parent_id + ", FatherNIC=" + FatherNIC + ", MotherNIC=" + MotherNIC
				+ ", FartherName=" + FartherName + ", MotherName=" + MotherName + ", FatherOccu=" + FatherOccu
				+ ", MotherOccu=" + MotherOccu + ", pendingstudent=" + pendingstudent + "]";
	}
	
}
	

