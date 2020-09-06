package com.graymatter.demo.lecture.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class WorkingExperience {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int WorkingExperience_ID;
	
	private String Work_Place;
	private String Post;
	private String No_Of_Years;
	/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "lec_id", referencedColumnName = "pendinglecturerid")
	private List<PendingLecture> pendingLec = new ArrayList<>();*/
	
	
	
	public int getWorkingExperience_ID() {
		return WorkingExperience_ID;
	}
	public void setWorkingExperience_ID(int workingExperience_ID) {
		WorkingExperience_ID = workingExperience_ID;
	}
	public String getWork_Place() {
		return Work_Place;
	}
	public void setWork_Place(String work_Place) {
		Work_Place = work_Place;
	}
	public String getPost() {
		return Post;
	}
	public void setPost(String post) {
		Post = post;
	}
	public String getNo_Of_Years() {
		return No_Of_Years;
	}
	public void setNo_Of_Years(String no_Of_Years) {
		No_Of_Years = no_Of_Years;
	}
	@Override
	public String toString() {
		return "WorkingExperience [WorkingExperience_ID=" + WorkingExperience_ID + ", Work_Place=" + Work_Place
				+ ", Post=" + Post + ", No_Of_Years=" + No_Of_Years + "]";
	}

	

}
