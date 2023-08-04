package com.wipro.octbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.octbs.model.Show;
import com.wipro.octbs.repository.ShowRepository;

@Service
public class ShowService {
	@Autowired
	private ShowRepository ShowRepo;
	
	public List<Show> getAllShows(){
		return ShowRepo.findAll();
	}
	
	public Show getShowByID(Long ShowID) {
		return ShowRepo.getById(ShowID);
	}
	
	public Show saveShowDetails(Show show) {
		return ShowRepo.save(show);
	}
	
	public void deleteShowByID(Long ShowID) {
		ShowRepo.deleteById(ShowID);
	}
	
	public Boolean showExists(Long ShowID) {
		return ShowRepo.existsById(ShowID);
	}
}
