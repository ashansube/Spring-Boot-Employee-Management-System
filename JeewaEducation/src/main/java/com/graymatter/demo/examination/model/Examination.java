package com.graymatter.demo.examination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Examination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Exam_Id;
	
	private String Exam_Type;
	private String Exam_Desc;
	private String Exam_Date;
	private String Enroll_Num;
	public int getExam_Id() {
		return Exam_Id;
	}
	public void setExam_Id(int exam_Id) {
		Exam_Id = exam_Id;
	}
	public String getExam_Type() {
		return Exam_Type;
	}
	public void setExam_Type(String exam_Type) {
		Exam_Type = exam_Type;
	}
	public String getExam_Desc() {
		return Exam_Desc;
	}
	public void setExam_Desc(String exam_Desc) {
		Exam_Desc = exam_Desc;
	}
	public String getExam_Date() {
		return Exam_Date;
	}
	public void setExam_Date(String exam_Date) {
		Exam_Date = exam_Date;
	}
	public String getEnroll_Num() {
		return Enroll_Num;
	}
	public void setEnroll_Num(String enroll_Num) {
		Enroll_Num = enroll_Num;
	}
	@Override
	public String toString() {
		return "Examination [Exam_Id=" + Exam_Id + ", Exam_Type=" + Exam_Type + ", Exam_Desc=" + Exam_Desc
				+ ", Exam_Date=" + Exam_Date + ", Enroll_Num=" + Enroll_Num + "]";
	}
	
	
	

}
