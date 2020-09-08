package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisaStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String NIC;
	private String name_with_ini;
	private String fullname;
	private String address;
	private int phonenum;
	private String enail;
	private String uni;
	private String age;
	private String course;
	private String sex;
	
	
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getName_with_ini() {
		return name_with_ini;
	}
	public void setName_with_ini(String name_with_ini) {
		this.name_with_ini = name_with_ini;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public String getEnail() {
		return enail;
	}
	public void setEnail(String enail) {
		this.enail = enail;
	}
	@Override
	public String toString() {
		return "VisaStudent [id=" + id + ", NIC=" + NIC + ", name_with_ini=" + name_with_ini + ", fullname=" + fullname
				+ ", address=" + address + ", phonenum=" + phonenum + ", enail=" + enail + ", uni=" + uni + ", age="
				+ age + ", course=" + course + ", sex=" + sex + "]";
	}
	
	
	
}
