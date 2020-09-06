package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PendingForVisa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String fname;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "Pending_For_Visa [id=" + id + ", fname=" + fname + "]";
	}
	
	
}
