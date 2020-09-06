package com.graymatter.demo.examination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DigitalLibrary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Lib_Id;
	
	private String address;

	public int getLib_Id() {
		return Lib_Id;
	}

	public void setLib_Id(int lib_Id) {
		Lib_Id = lib_Id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DigitalLibrary [Lib_Id=" + Lib_Id + ", address=" + address + "]";
	}
	

}
