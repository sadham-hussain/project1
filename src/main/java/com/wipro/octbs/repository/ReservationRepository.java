package com.wipro.octbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.octbs.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
