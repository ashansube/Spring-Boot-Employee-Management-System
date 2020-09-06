package com.graymatter.demo.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducationQualification {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int OL_indexNo;
	
	private String OL_Index_No;
	private String sub1;
	private String result1;
	private String sub2;
	private String result2;
	private String sub3;
	private String result3;
	private String sub4;
	private String result4;
	private String sub5;
	private String result5;
	private String sub6;
	private String result6;
	private String sub7;
	private String result7;
	private String sub8;
	private String result8;
	private String sub9;
	private String result9;
	
	private String AL_Index_No;
	private String subA1;
	private String resultA1;
	private String subA2;
	private String resultA2;
	private String subA3;
	private String resultA3;
	public int getOL_indexNo() {
		return OL_indexNo;
	}
	public void setOL_indexNo(int oL_indexNo) {
		OL_indexNo = oL_indexNo;
	}
	public String getOL_Index_No() {
		return OL_Index_No;
	}
	public void setOL_Index_No(String oL_Index_No) {
		OL_Index_No = oL_Index_No;
	}
	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getResult1() {
		return result1;
	}
	public void setResult1(String result1) {
		this.result1 = result1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	public String getResult2() {
		return result2;
	}
	public void setResult2(String result2) {
		this.result2 = result2;
	}
	public String getSub3() {
		return sub3;
	}
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	public String getResult3() {
		return result3;
	}
	public void setResult3(String result3) {
		this.result3 = result3;
	}
	public String getSub4() {
		return sub4;
	}
	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}
	public String getResult4() {
		return result4;
	}
	public void setResult4(String result4) {
		this.result4 = result4;
	}
	public String getSub5() {
		return sub5;
	}
	public void setSub5(String sub5) {
		this.sub5 = sub5;
	}
	public String getResult5() {
		return result5;
	}
	public void setResult5(String result5) {
		this.result5 = result5;
	}
	public String getSub6() {
		return sub6;
	}
	public void setSub6(String sub6) {
		this.sub6 = sub6;
	}
	public String getResult6() {
		return result6;
	}
	public void setResult6(String result6) {
		this.result6 = result6;
	}
	public String getSub7() {
		return sub7;
	}
	public void setSub7(String sub7) {
		this.sub7 = sub7;
	}
	public String getResult7() {
		return result7;
	}
	public void setResult7(String result7) {
		this.result7 = result7;
	}
	public String getSub8() {
		return sub8;
	}
	public void setSub8(String sub8) {
		this.sub8 = sub8;
	}
	public String getResult8() {
		return result8;
	}
	public void setResult8(String result8) {
		this.result8 = result8;
	}
	public String getSub9() {
		return sub9;
	}
	public void setSub9(String sub9) {
		this.sub9 = sub9;
	}
	public String getResult9() {
		return result9;
	}
	public void setResult9(String result9) {
		this.result9 = result9;
	}
	public String getAL_Index_No() {
		return AL_Index_No;
	}
	public void setAL_Index_No(String aL_Index_No) {
		AL_Index_No = aL_Index_No;
	}
	public String getSubA1() {
		return subA1;
	}
	public void setSubA1(String subA1) {
		this.subA1 = subA1;
	}
	public String getResultA1() {
		return resultA1;
	}
	public void setResultA1(String resultA1) {
		this.resultA1 = resultA1;
	}
	public String getSubA2() {
		return subA2;
	}
	public void setSubA2(String subA2) {
		this.subA2 = subA2;
	}
	public String getResultA2() {
		return resultA2;
	}
	public void setResultA2(String resultA2) {
		this.resultA2 = resultA2;
	}
	public String getSubA3() {
		return subA3;
	}
	public void setSubA3(String subA3) {
		this.subA3 = subA3;
	}
	public String getResultA3() {
		return resultA3;
	}
	public void setResultA3(String resultA3) {
		this.resultA3 = resultA3;
	}
	@Override
	public String toString() {
		return "EducationQualification [OL_indexNo=" + OL_indexNo + ", OL_Index_No=" + OL_Index_No + ", sub1=" + sub1
				+ ", result1=" + result1 + ", sub2=" + sub2 + ", result2=" + result2 + ", sub3=" + sub3 + ", result3="
				+ result3 + ", sub4=" + sub4 + ", result4=" + result4 + ", sub5=" + sub5 + ", result5=" + result5
				+ ", sub6=" + sub6 + ", result6=" + result6 + ", sub7=" + sub7 + ", result7=" + result7 + ", sub8="
				+ sub8 + ", result8=" + result8 + ", sub9=" + sub9 + ", result9=" + result9 + ", AL_Index_No="
				+ AL_Index_No + ", subA1=" + subA1 + ", resultA1=" + resultA1 + ", subA2=" + subA2 + ", resultA2="
				+ resultA2 + ", subA3=" + subA3 + ", resultA3=" + resultA3 + "]";
	}
	
	
	
	
	

}
