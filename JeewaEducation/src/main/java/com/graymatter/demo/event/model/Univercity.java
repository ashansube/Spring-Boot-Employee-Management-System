package com.graymatter.demo.event.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Univercity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Uni_id;
	
	private String uni_name;
	private String city;
	private int No_degrees;
	public int getUni_id() {
		return Uni_id;
	}
	public void setUni_id(int uni_id) {
		Uni_id = uni_id;
	}
	public String getUni_name() {
		return uni_name;
	}
	public void setUni_name(String uni_name) {
		this.uni_name = uni_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNo_degrees() {
		return No_degrees;
	}
	public void setNo_degrees(int no_degrees) {
		No_degrees = no_degrees;
	}
	@Override
	public String toString() {
		return "Univercity [Uni_id=" + Uni_id + ", uni_name=" + uni_name + ", city=" + city + ", No_degrees="
				+ No_degrees + "]";
	}
	
	
	
	
}
