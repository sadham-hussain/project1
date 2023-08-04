package com.wipro.octbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.octbs.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{
	
}
