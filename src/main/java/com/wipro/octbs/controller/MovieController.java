package com.wipro.octbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.octbs.model.Movie;
import com.wipro.octbs.service.MovieService;

@Controller
public class MovieController {
	private Long selectedMovie;
	@Autowired
	private MovieService MovieServ;
	
	@RequestMapping(value="/AddMovie",method=RequestMethod.GET)
	public String AddMoviePage() {
		
		return "AddMovie";
	}
	
	@RequestMapping(value="/EditMovie",method=RequestMethod.GET)
	public String EditMoviePage(ModelMap model) {
		List<Movie> MovieList = MovieServ.getAllMovies();
		model.put("MovieList", MovieList);
		
		return "EditMovie";
	}
	
	@RequestMapping(value="/ViewMovie",method=RequestMethod.GET)
	public String ViewMoviePage() {
		return "ViewMovie";
	}
	
	@RequestMapping(value="/DeleteMovie",method=RequestMethod.GET)
	public String DeleteMoviePage(ModelMap model) {
		List<Movie> MovieList = MovieServ.getAllMovies();
		model.put("MovieList", MovieList);
		return "DeleteMovie";
	}
	
	@RequestMapping(value="/AddMovie",method=RequestMethod.POST)
	public String AddMovie(ModelMap model,@RequestParam String MovieName,@RequestParam String Language,@RequestParam float Duration) {
		Movie newMovie = new Movie(1l,MovieName,Language,Duration);
		Movie addedMovie = MovieServ.saveMovieDetails(newMovie);
		model.put("GeneratedID", "Generated ID is "+addedMovie.getMovieID());
		
		return "AddMovie";
	}
	
	@RequestMapping(value="/EditMovieListReload",method=RequestMethod.GET)
	public String EditMovieListReload(ModelMap model,@RequestParam Long SelectedMovie) {
		selectedMovie = SelectedMovie;
		Movie editMovie = MovieServ.getMovieByID(SelectedMovie);
		model.put("MovieName",editMovie.getMovieName());
		model.put("Language",editMovie.getLanguage());
		model.put("Duration",editMovie.getDuration());
		List<Movie> MovieList = MovieServ.getAllMovies();
		model.put("MovieList", MovieList);
		return "EditMovie";
	}
	
	@RequestMapping(value="/EditMovie",method=RequestMethod.POST)
	public String EditMovie(ModelMap model,@RequestParam String MovieName,@RequestParam String Language,@RequestParam float Duration) {
		Movie editMovie = MovieServ.getMovieByID(selectedMovie);
		editMovie.setMovieName(MovieName);
		editMovie.setLanguage(Language);
		editMovie.setDuration(Duration);
		MovieServ.saveMovieDetails(editMovie);
		List<Movie> MovieList = MovieServ.getAllMovies();
		model.put("MovieList", MovieList);
		return "EditMovie";
	}
	
	@RequestMapping(value="/DeleteMovieListReload",method=RequestMethod.GET)
	public String DeleteMovieListReload(ModelMap model,@RequestParam Long SelectedMovie) {
		selectedMovie = SelectedMovie;
		Movie deleteMovie = MovieServ.getMovieByID(SelectedMovie);
		model.put("MovieName",deleteMovie.getMovieName());
		model.put("Language",deleteMovie.getLanguage());
		model.put("Duration",deleteMovie.getDuration());
		List<Movie> MovieList = MovieServ.getAllMovies();
		model.put("MovieList", MovieList);
		return "DeleteMovie";
	}
	
	@RequestMapping(value="/DeleteMovie",method=RequestMethod.POST)
	public String DeleteMovie(ModelMap model) {
		MovieServ.deleteMovieByID(selectedMovie);
		List<Movie> MovieList = MovieServ.getAllMovies();
		model.put("MovieList", MovieList);
		return "DeleteMovie";
	}
}
