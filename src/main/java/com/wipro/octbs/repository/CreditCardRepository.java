package com.wipro.octbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.octbs.model.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Long>{

}
