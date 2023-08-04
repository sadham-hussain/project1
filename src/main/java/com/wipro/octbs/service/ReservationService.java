package com.wipro.octbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.octbs.model.Reservation;
import com.wipro.octbs.repository.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository ReservationRepo;
	
	public List<Reservation> getAllReservations(){
		return ReservationRepo.findAll();
	}
	
	public Reservation SaveReservation(Reservation reservation) {
		return ReservationRepo.save(reservation);
	}
	
	public Reservation getReservationByID(Long ReservationID) {
		return ReservationRepo.getById(ReservationID);
	}
	
	public void DeleteReservation(Long ReservationID) {
		ReservationRepo.deleteById(ReservationID);
	}
	
	public Boolean ReservationExists(Long ReservationID) {
		return ReservationRepo.existsById(ReservationID);
	}
}
