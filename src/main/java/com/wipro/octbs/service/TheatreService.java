package com.wipro.octbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.octbs.model.Theatre;
import com.wipro.octbs.repository.TheatreRepository;

@Service
public class TheatreService {
	@Autowired
	private TheatreRepository TheatreRepo;
	
	public List<Theatre> getAllTheatres(){
		return TheatreRepo.findAll();
	}
	
	public Theatre saveTheatreDetails(Theatre theatre){
		return TheatreRepo.save(theatre);
	}
	
	public Theatre getTheatreByID(Long TheatreID) {
		return TheatreRepo.getById(TheatreID);
	}
	
	public void deleteTheatreByID(Long TheatreID) {
		TheatreRepo.deleteById(TheatreID);
	}
	
	public Boolean theatreExists(Long UserID) {
		return TheatreRepo.existsById(UserID);
	}
}
