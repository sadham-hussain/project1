package com.wipro.octbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.octbs.model.LoginCredentials;

@Repository
public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials,String> {

}
