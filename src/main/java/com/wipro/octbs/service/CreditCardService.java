package com.wipro.octbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.octbs.model.CreditCard;
import com.wipro.octbs.repository.CreditCardRepository;

@Service
public class CreditCardService {
	@Autowired
	private CreditCardRepository CreditCardRepo;
	
	public Boolean CreditCardExists(Long CreditCardID) {
		return CreditCardRepo.existsById(CreditCardID);
	}
	
	public CreditCard GetCreditCardDetails(Long CreditCardID) {
		return CreditCardRepo.getById(CreditCardID);
	}
	
	public CreditCard SaveCreditCardDetails(CreditCard card) {
		return CreditCardRepo.save(card);
	}
}
