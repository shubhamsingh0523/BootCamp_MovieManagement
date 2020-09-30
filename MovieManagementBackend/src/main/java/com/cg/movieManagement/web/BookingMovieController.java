package com.cg.movieManagement.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.movieManagement.dto.BookingForm;
import com.cg.movieManagement.dto.MovieMessage;
import com.cg.movieManagement.exceptions.BookingException;
import com.cg.movieManagement.service.MovieBookingService;
import com.cg.movieManagement.util.MovieConstants;


@RestController
public class BookingMovieController {
	
	@Autowired
	private MovieBookingService service;
	
	
	@CrossOrigin
	@PostMapping("/booking")
	public MovieMessage doBooking(@RequestBody BookingForm form) throws BookingException {
		String bookingId = service.addBooking(form);
		MovieMessage msg = new MovieMessage();
		msg.setMessage(bookingId);
		return msg;
	}
	
	
	@CrossOrigin
	@GetMapping("/cancelbooking/{bookingid}")
	public MovieMessage cancelBooking(@PathVariable(name="bookingid") String bookingId) throws BookingException {
		service.cancelBooking(bookingId);
		MovieMessage msg = new MovieMessage();
		msg.setMessage(MovieConstants.BOOKING_CANCELLED);
		return msg;
	}

}
