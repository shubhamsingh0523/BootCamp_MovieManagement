package com.cg.movieManagement.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.movieManagement.entities.Movie;
import com.cg.movieManagement.entities.Show;
import com.cg.movieManagement.exceptions.MovieNotFoundException;
import com.cg.movieManagement.exceptions.ShowException;


public interface SearchService {

	public List<Movie> getMovies(String searchStr)throws MovieNotFoundException;
	public List<Show> getShows(String screenName)throws ShowException;
	public List<Show> getShows(LocalDate searchDt, int movieId)throws ShowException;
	public List<Show> getShows(String screenName, LocalDate searchDt, int movieId)throws ShowException;
	public List<Show> getShows(String screenName, LocalDate searchDt)throws ShowException;
}
