package com.graymatter.demo.univercity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Univercity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uni_id;
	
	private String uni_name;
	
}
