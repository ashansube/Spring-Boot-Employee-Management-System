package com.graymatter.demo.timetable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LectureTimetable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Lec_time_id;
	
	private String subject;
	private String venue;
	private String time;
	public int getLec_time_id() {
		return Lec_time_id;
	}
	public void setLec_time_id(int lec_time_id) {
		Lec_time_id = lec_time_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "LectureTimetable [Lec_time_id=" + Lec_time_id + ", subject=" + subject + ", venue=" + venue + ", time="
				+ time + "]";
	}
	
	

}
