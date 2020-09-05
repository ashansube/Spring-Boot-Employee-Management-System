package com.graymatter.demo.lecture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducationalBackground {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int EducationalBackground_ID;
	
	private String Name_Qualification;
	private String Type;
	private String Obtained_Year;
	private String Institute;
	private String Subjects;
	
	
	public int getEducationalBackground_ID() {
		return EducationalBackground_ID;
	}
	public void setEducationalBackground_ID(int educationalBackground_ID) {
		EducationalBackground_ID = educationalBackground_ID;
	}
	public String getName_Qualification() {
		return Name_Qualification;
	}
	public void setName_Qualification(String name_Qualification) {
		Name_Qualification = name_Qualification;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getObtained_Year() {
		return Obtained_Year;
	}
	public void setObtained_Year(String obtained_Year) {
		Obtained_Year = obtained_Year;
	}
	public String getInstitute() {
		return Institute;
	}
	public void setInstitute(String institute) {
		Institute = institute;
	}
	public String getSubjects() {
		return Subjects;
	}
	public void setSubjects(String subjects) {
		Subjects = subjects;
	}
	
	
	@Override
	public String toString() {
		return "EducationalBackground [EducationalBackground_ID=" + EducationalBackground_ID + ", Name_Qualification="
				+ Name_Qualification + ", Type=" + Type + ", Obtained_Year=" + Obtained_Year + ", Institute="
				+ Institute + ", Subjects=" + Subjects + "]";
	}
	
	
	

}
