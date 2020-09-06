package com.graymatter.demo.visa.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.graymatter.demo.payment.model.VisaPayment;
import com.graymatter.demo.student.model.PendingStudent;


@Entity
public class VisaVerified {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Lob
	private byte[] photo_color;
	
	@Lob
	private byte[] photo_black;
	
	@Lob
	private byte[] passport;
	
	@Lob
	private byte[] NIC_scan_copy;
	
	@Lob
	private byte[] address_prof;
	
	@Lob
	private byte[] police_report;
	
	@Lob
	private byte[] medical_report;
	
	@OneToMany(targetEntity = VisaPayment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "visa_id_fk", referencedColumnName = "id")
	private List<VisaPayment> visapayment;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pendingStudent_FK")
	private PendingStudent pendingStudent;

	public List<VisaPayment> getVisapayment() {
		return visapayment;
	}

	public void setVisapayment(List<VisaPayment> visapayment) {
		this.visapayment = visapayment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getPhoto_color() {
		return photo_color;
	}

	public void setPhoto_color(byte[] photo_color) {
		this.photo_color = photo_color;
	}

	public byte[] getPhoto_black() {
		return photo_black;
	}

	public void setPhoto_black(byte[] photo_black) {
		this.photo_black = photo_black;
	}

	public byte[] getPassport() {
		return passport;
	}

	public void setPassport(byte[] passport) {
		this.passport = passport;
	}

	public byte[] getNIC_scan_copy() {
		return NIC_scan_copy;
	}

	public void setNIC_scan_copy(byte[] nIC_scan_copy) {
		NIC_scan_copy = nIC_scan_copy;
	}

	public byte[] getAddress_prof() {
		return address_prof;
	}

	public void setAddress_prof(byte[] address_prof) {
		this.address_prof = address_prof;
	}

	public byte[] getPolice_report() {
		return police_report;
	}

	public void setPolice_report(byte[] police_report) {
		this.police_report = police_report;
	}

	public byte[] getMedical_report() {
		return medical_report;
	}

	public void setMedical_report(byte[] medical_report) {
		this.medical_report = medical_report;
	}

	public PendingStudent getPendingStudent() {
		return pendingStudent;
	}

	public void setPendingStudent(PendingStudent pendingStudent) {
		this.pendingStudent = pendingStudent;
	}

	@Override
	public String toString() {
		return "VisaVerified [id=" + id + ", photo_color=" + Arrays.toString(photo_color) + ", photo_black="
				+ Arrays.toString(photo_black) + ", passport=" + Arrays.toString(passport) + ", NIC_scan_copy="
				+ Arrays.toString(NIC_scan_copy) + ", address_prof=" + Arrays.toString(address_prof)
				+ ", police_report=" + Arrays.toString(police_report) + ", medical_report="
				+ Arrays.toString(medical_report) + ", visapayment=" + visapayment + ", pendingStudent="
				+ pendingStudent + "]";
	}
	
	
}
