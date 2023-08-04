package com.wipro.octbs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.octbs.model.User;
import com.wipro.octbs.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User saveUserDetails(User user){
		return userRepo.save(user);
	}
	
	public User getUserByID(Long UserID) {
		return userRepo.getById(UserID);
	}
	
	public Boolean userExists(Long UserID) {
		return userRepo.existsById(UserID);
	}
}
