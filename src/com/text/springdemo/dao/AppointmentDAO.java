package com.text.springdemo.dao;

import java.util.List;

import com.text.springdemo.entity.Appointment;

public interface AppointmentDAO {
	
	public void saveAppointment(Appointment theAppointment);

	public List<Appointment> getAppointments();

	public Appointment getAppointment(int num);

	public void deleteAppointment(int num);

}
