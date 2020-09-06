package com.graymatter.demo.examination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Sub_Id;
	
	private String sub_name;

	public int getSub_Id() {
		return Sub_Id;
	}

	public void setSub_Id(int sub_Id) {
		Sub_Id = sub_Id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	@Override
	public String toString() {
		return "Subjects [Sub_Id=" + Sub_Id + ", sub_name=" + sub_name + "]";
	}
	
	

}
