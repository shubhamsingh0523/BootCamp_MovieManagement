package com.cg.movieManagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cg.movieManagement.entities.Booking;
import com.cg.movieManagement.exceptions.BookingException;
import com.cg.movieManagement.service.ViewBookingService;

@RestController
public class ViewBookingController {

	@Autowired
	

	private ViewBookingService service;
	@CrossOrigin
	@GetMapping("getbooking/{contact}")    
	public List<Booking> getBookingDetails(@PathVariable("contact") String Contact) throws BookingException 
	{
		List<Booking> bookingDetails = service.getBookingDetails(Contact);
		return bookingDetails;          
	}
}
