package com.text.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.text.springdemo.entity.Appointment;
import com.text.springdemo.entity.Doctor;

@Repository
public class AppointmentDAOImppl implements AppointmentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public void saveAppointment(Appointment theAppointment) {
		Session currentSession=sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theAppointment);
		
	}

	@Override
	@Transactional
	public List<Appointment> getAppointments() {
		
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Appointment> theQuery=currentSession.createQuery("from Appointment",Appointment.class);
		
		List<Appointment> appointments=theQuery.getResultList();
		
		return appointments;
	}

	@Override
	@Transactional
	public Appointment getAppointment(int num) {
		Session currentSession=sessionFactory.getCurrentSession();
		
		Appointment theAppointment=currentSession.get(Appointment.class,num);
		
		return theAppointment;
	}

	@Override
	@Transactional
	public void deleteAppointment(int num) {
		Session currentSession=sessionFactory.getCurrentSession();
		
		Query theQuery=currentSession.createQuery("delete from Appointment where serial_no=:Serialnum");
		theQuery.setParameter("Serialnum", num);
		
		theQuery.executeUpdate();
	}

}
