package com.wipro.octbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.octbs.model.LoginCredentials;
import com.wipro.octbs.repository.LoginCredentialsRepository;

@Service
public class LoginCredentialsService {
	@Autowired
	private LoginCredentialsRepository loginCredentialsRepo;
	public LoginCredentials getUserByID(String UserID) {
		return loginCredentialsRepo.getById(UserID);
	}
	public Boolean userExists(String UserID) {
		return loginCredentialsRepo.existsById(UserID);
	}
	
}
