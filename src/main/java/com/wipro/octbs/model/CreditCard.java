package com.wipro.octbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CreditCard")
public class CreditCard {
	@Id
	@Column(name="CreditCardNumber")
	private Long CreditCardNumber;
	@Column(name="ValidFrom")
	private String ValidFrom;
	@Column(name="ValidTo")
	private String ValidTo;
	@Column(name="Balance")
	private float Balance;
	@Column(name="Pin")
	private int Pin;
	public Long getCreditCardNumber() {
		return CreditCardNumber;
	}
	public void setCreditCardNumber(Long creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}
	public String getValidFrom() {
		return ValidFrom;
	}
	public void setValidFrom(String validFrom) {
		ValidFrom = validFrom;
	}
	public String getValidTo() {
		return ValidTo;
	}
	public void setValidTo(String validTo) {
		ValidTo = validTo;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public CreditCard() {}
	public CreditCard(Long creditCardNumber, String validFrom, String validTo, float balance, int pin) {
		super();
		CreditCardNumber = creditCardNumber;
		ValidFrom = validFrom;
		ValidTo = validTo;
		Balance = balance;
		Pin = pin;
	}
	@Override
	public String toString() {
		return "CreditCard [CreditCardNumber=" + CreditCardNumber + ", ValidFrom=" + ValidFrom + ", ValidTo=" + ValidTo
				+ ", Balance=" + Balance + ", Pin=" + Pin + "]";
	}
}
