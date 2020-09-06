package com.graymatter.demo.examination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Papers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Paper_id;
	
	private String Paper_name;
	private String paper_desc;
	private String paper_type;
	public int getPaper_id() {
		return Paper_id;
	}
	public void setPaper_id(int paper_id) {
		Paper_id = paper_id;
	}
	public String getPaper_name() {
		return Paper_name;
	}
	public void setPaper_name(String paper_name) {
		Paper_name = paper_name;
	}
	public String getPaper_desc() {
		return paper_desc;
	}
	public void setPaper_desc(String paper_desc) {
		this.paper_desc = paper_desc;
	}
	public String getPaper_type() {
		return paper_type;
	}
	public void setPaper_type(String paper_type) {
		this.paper_type = paper_type;
	}
	@Override
	public String toString() {
		return "Papers [Paper_id=" + Paper_id + ", Paper_name=" + Paper_name + ", paper_desc=" + paper_desc
				+ ", paper_type=" + paper_type + "]";
	}
	
	
	
	

}
