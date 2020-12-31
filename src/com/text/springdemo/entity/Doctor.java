package com.text.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="doctor_name")
	private String doctorName;
	
	@Column(name="specification")
	private String specification;
	
	@Column(name="availability_to_time")
	private String availability_to_time;
	
	@Column(name="availability_from_time")
	private String availability_from_time;
	
	public Doctor()
	{
		
	}

	
	
	
	public Doctor(String doctorName, String specification, String availability_to_time, String availability_from_time) {
		this.doctorName = doctorName;
		this.specification = specification;
		this.availability_to_time = availability_to_time;
		this.availability_from_time = availability_from_time;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getAvailability_to_time() {
		return availability_to_time;
	}

	public void setAvailability_to_time(String availability_to_time) {
		this.availability_to_time = availability_to_time;
	}

	public String getAvailability_from_time() {
		return availability_from_time;
	}

	public void setAvailability_from_time(String availability_from_time) {
		this.availability_from_time = availability_from_time;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", specification=" + specification
				+ ", availability_to_time=" + availability_to_time + ", availability_from_time="
				+ availability_from_time + "]";
	}
	
	
	
}
