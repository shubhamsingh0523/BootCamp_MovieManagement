package com.cg.movieManagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.movieManagement.entities.Movie;
import com.cg.movieManagement.exceptions.MovieNotFoundException;
import com.cg.movieManagement.service.ViewMovieService;



@RestController
public class ViewMovieController {

	@Autowired
	private ViewMovieService service;
	
	
	@CrossOrigin
	@GetMapping("/viewmovies")
	public List<Movie> viewMovies() throws MovieNotFoundException {		
		return service.viewMovies();
	}
	
	
	@CrossOrigin
	@GetMapping("/viewnewmovies")
	public List<Movie> viewNewMovies() throws MovieNotFoundException {
		return service.viewNewMovies();
	}
}
