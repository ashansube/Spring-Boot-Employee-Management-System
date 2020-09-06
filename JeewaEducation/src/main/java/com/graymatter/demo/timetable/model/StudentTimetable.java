package com.graymatter.demo.timetable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentTimetable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Stu_time_id;
	
	private String subject;
	private String venue;
	private String time;
	public int getStu_time_id() {
		return Stu_time_id;
	}
	public void setStu_time_id(int stu_time_id) {
		Stu_time_id = stu_time_id;
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
		return "StudentTimetable [Stu_time_id=" + Stu_time_id + ", subject=" + subject + ", venue=" + venue + ", time="
				+ time + "]";
	}
	
	

}
