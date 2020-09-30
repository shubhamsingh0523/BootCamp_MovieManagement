package com.cg.movieManagement.service;

import java.util.List;

import com.cg.movieManagement.entities.Booking;
import com.cg.movieManagement.exceptions.BookingException;


public interface ViewBookingService {
	public List<Booking> getBookingDetails(String Contact)throws BookingException;
}
