package com.graymatter.demo.lecture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Subject_ID;
	
	private String Subject_Name;
	private String Lesson;
	private String Course_Material;
	
	
	public int getSubject_ID() {
		return Subject_ID;
	}
	public void setSubject_ID(int subject_ID) {
		Subject_ID = subject_ID;
	}
	public String getSubject_Name() {
		return Subject_Name;
	}
	public void setSubject_Name(String subject_Name) {
		Subject_Name = subject_Name;
	}
	public String getLesson() {
		return Lesson;
	}
	public void setLesson(String lesson) {
		Lesson = lesson;
	}
	public String getCourse_Material() {
		return Course_Material;
	}
	public void setCourse_Material(String course_Material) {
		Course_Material = course_Material;
	}
	
	
	@Override
	public String toString() {
		return "Subject [Subject_ID=" + Subject_ID + ", Subject_Name=" + Subject_Name + ", Lesson=" + Lesson
				+ ", Course_Material=" + Course_Material + "]";
	}
		

}
