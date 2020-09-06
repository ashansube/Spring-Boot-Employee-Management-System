package com.graymatter.demo.lecture.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.*;

import antlr.collections.List;

@Entity
public class Teaching_Experience {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int TeachingExperience_ID;
	
	private String W_Subject;
	private String Level_Taught;
	private String No_Of_Years;
	
	

	
	public int getTeachingExperience_ID() {
		return TeachingExperience_ID;
	}
	public void setTeachingExperience_ID(int teachingExperience_ID) {
		TeachingExperience_ID = teachingExperience_ID;
	}
	public String getW_Subject() {
		return W_Subject;
	}
	public void setW_Subject(String w_Subject) {
		W_Subject = w_Subject;
	}
	public String getLevel_Taught() {
		return Level_Taught;
	}
	public void setLevel_Taught(String level_Taught) {
		Level_Taught = level_Taught;
	}
	public String getNo_Of_Years() {
		return No_Of_Years;
	}
	public void setNo_Of_Years(String no_Of_Years) {
		No_Of_Years = no_Of_Years;
	}
	@Override
	public String toString() {
		return "Teaching_Experience [TeachingExperience_ID=" + TeachingExperience_ID + ", W_Subject=" + W_Subject
				+ ", Level_Taught=" + Level_Taught + ", No_Of_Years=" + No_Of_Years + "]";
	}
	
	
	
	

	
	
}
