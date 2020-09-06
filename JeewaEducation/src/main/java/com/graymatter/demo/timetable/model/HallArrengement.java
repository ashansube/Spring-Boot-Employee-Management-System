package com.graymatter.demo.timetable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HallArrengement {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hall_id;
	
	private String exam_date;
	private String time;
	public int getHall_id() {
		return hall_id;
	}
	public void setHall_id(int hall_id) {
		this.hall_id = hall_id;
	}
	public String getExam_date() {
		return exam_date;
	}
	public void setExam_date(String exam_date) {
		this.exam_date = exam_date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "HallArrengement [hall_id=" + hall_id + ", exam_date=" + exam_date + ", time=" + time + "]";
	}
	
	

}
