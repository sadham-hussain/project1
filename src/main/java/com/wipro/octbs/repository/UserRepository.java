package com.wipro.octbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.octbs.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	
}
