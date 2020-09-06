package com.graymatter.demo.examination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Result_Id;
	
	private String Grade;
	private String Date_published;
	public int getResult_Id() {
		return Result_Id;
	}
	public void setResult_Id(int result_Id) {
		Result_Id = result_Id;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getDate_published() {
		return Date_published;
	}
	public void setDate_published(String date_published) {
		Date_published = date_published;
	}
	@Override
	public String toString() {
		return "Result [Result_Id=" + Result_Id + ", Grade=" + Grade + ", Date_published=" + Date_published + "]";
	}
	
	

}
