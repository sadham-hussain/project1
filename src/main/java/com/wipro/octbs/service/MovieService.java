package com.wipro.octbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.octbs.model.Movie;
import com.wipro.octbs.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository MovieRepo;
	
	public List<Movie> getAllMovies(){
		return MovieRepo.findAll();
	}
	
	public Movie getMovieByID(Long MovieID) {
		return MovieRepo.getById(MovieID);
	}
	
	public Movie saveMovieDetails(Movie movie) {
		return MovieRepo.save(movie);
	}
	
	public void deleteMovieByID(Long MovieID) {
		MovieRepo.deleteById(MovieID);
	}
	public Boolean movieExists(Long MovieID) {
		return MovieRepo.existsById(MovieID);
	}
	
	
}
