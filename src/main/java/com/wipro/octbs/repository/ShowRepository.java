package com.wipro.octbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.octbs.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long>{
	
}

