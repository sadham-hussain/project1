package com.wipro.octbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoginCredentials")
public class LoginCredentials {
	@Id
	@Column(name="UserId")
	private String UserID;
	@Column(name="UserType")
	private String UserType;
	@Column(name="Password")
	private String Password;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "LoginCredentials [UserID=" + UserID + ", UserType=" + UserType + ", Password=" + Password + "]";
	}
	public LoginCredentials() {}
	public LoginCredentials(String userID, String userType, String password) {
		super();
		UserID = userID;
		UserType = userType;
		Password = password;
	}
	
}
