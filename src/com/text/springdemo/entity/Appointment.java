package com.text.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serial_no")
	private int serialNo;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="patient_mobile_no")
	private String patientMobileNo;
	
	@Column(name="patient_date_of_birth")
	private String patientDateOfBirth;
	
	@Column(name="appointment_date")
	private String appointmentDate;
	
	@Column(name="doctor_id")
	private String doctorId;
	
	public Appointment()
	{
		
	}

	
	
	
	public Appointment(String patientName, String emailid, String patientMobileNo, String patientDateOfBirth,
			String appointmentDate, String doctorId) {
		this.patientName = patientName;
		this.emailid = emailid;
		this.patientMobileNo = patientMobileNo;
		this.patientDateOfBirth = patientDateOfBirth;
		this.appointmentDate = appointmentDate;
		this.doctorId = doctorId;
	}


	public int getSerialNo() {
		return serialNo;
	}




	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}




	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPatientMobileNo() {
		return patientMobileNo;
	}

	public void setPatientMobileNo(String patientMobileNo) {
		this.patientMobileNo = patientMobileNo;
	}

	public String getPatientDateOfBirth() {
		return patientDateOfBirth;
	}

	public void setPatientDateOfBirth(String patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	@Override
	public String toString() {
		return "Appointment [patientName=" + patientName + ", emailid=" + emailid + ", patientMobileNo="
				+ patientMobileNo + ", patientDateOfBirth=" + patientDateOfBirth + ", appointmentDate="
				+ appointmentDate + ", doctorId=" + doctorId + "]";
	}
	
	

}
