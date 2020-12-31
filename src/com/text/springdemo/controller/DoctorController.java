package com.text.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.text.springdemo.dao.AppointmentDAO;
import com.text.springdemo.dao.DoctorDAO;
import com.text.springdemo.entity.Appointment;
import com.text.springdemo.entity.Doctor;


@Controller
@RequestMapping("/doctors")
public class DoctorController {
	
	@Autowired
	private DoctorDAO dosctorDAO;
	
	
	@Autowired
	private AppointmentDAO appointmentDAO;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listDoctors(Model model)
	{	
		List<Doctor> doctors=dosctorDAO.getDoctors();	
		
		model.addAttribute("doctor",doctors);
		
	return "list-doctors";	
	}
	
	@GetMapping("/showFormForTake")
	public String showFormForTake(Model model)
	{
		Appointment theAppointment=new Appointment();
		
		model.addAttribute("appointment", theAppointment);
		
		return "appointment-form";
	}
	
	@PostMapping("/saveAppointment")
	public String saveAppointment(@ModelAttribute("appointment") Appointment theAppointment)
	{
		appointmentDAO.saveAppointment(theAppointment);	
		return "redirect:/doctors/showAppointsList";
		
	}
	
	
	@GetMapping("/showAppointsList")
	public String listAppointments(Model model)
	{
List<Appointment> appointment=appointmentDAO.getAppointments();	
		
		model.addAttribute("appointment",appointment);
		
		
		return "appointment-list";
	}
	
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("serialNo") int num, Model model)
	{
		
		Appointment theAppointment=appointmentDAO.getAppointment(num);
		
		model.addAttribute("appointment",theAppointment);
		
		return "appointment-form";
	
	
}
	@GetMapping("delete")
	public String deleteAppointmentt(@RequestParam("serialNo") int num)
	{
		
		appointmentDAO.deleteAppointment(num);
		
		return "redirect:/doctors/showAppointsList";
		
	}
	
	
}