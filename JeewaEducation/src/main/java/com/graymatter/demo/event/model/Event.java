package com.graymatter.demo.event.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int event_id;
	
	private String EventName;
	private String Venue;
	private String Date;
	private String Time;

}
