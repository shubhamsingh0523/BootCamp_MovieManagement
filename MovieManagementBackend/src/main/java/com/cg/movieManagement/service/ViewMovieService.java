package com.cg.movieManagement.service;

import java.util.List;

import com.cg.movieManagement.entities.Movie;
import com.cg.movieManagement.exceptions.MovieNotFoundException;


public interface ViewMovieService {

	public List<Movie> viewMovies() throws MovieNotFoundException;
	public List<Movie> viewNewMovies() throws MovieNotFoundException;
}
