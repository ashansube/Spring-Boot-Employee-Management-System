package com.graymatter.demo.event.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DegreeProgram {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Degree_id;
	
	private String Field;
	private String duration;
	private double Fees;
	public int getDegree_id() {
		return Degree_id;
	}
	public void setDegree_id(int degree_id) {
		Degree_id = degree_id;
	}
	public String getField() {
		return Field;
	}
	public void setField(String field) {
		Field = field;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public double getFees() {
		return Fees;
	}
	public void setFees(double fees) {
		Fees = fees;
	}
	@Override
	public String toString() {
		return "DegreeProgram [Degree_id=" + Degree_id + ", Field=" + Field + ", duration=" + duration + ", Fees="
				+ Fees + "]";
	}
	
	

}
