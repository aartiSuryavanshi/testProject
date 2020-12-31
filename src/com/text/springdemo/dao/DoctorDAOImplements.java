package com.text.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.text.springdemo.entity.Doctor;

@Repository
public class DoctorDAOImplements implements DoctorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Doctor> getDoctors() {
		
		Session currentSession=sessionFactory.getCurrentSession();
		
		Query<Doctor> theQuery=currentSession.createQuery("from Doctor",Doctor.class);
		
		List<Doctor> doctors=theQuery.getResultList();
		
		return doctors;
	}

}
