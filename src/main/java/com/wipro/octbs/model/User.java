package com.wipro.octbs.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "userdeta")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long UserID;
	@Column(name = "Password")
	private String Password;
	@Column(name = "FirstName")
	private String FirstName;
	@Column(name = "LastName")
	private String LastName;
	
	@Column(name = "DOB")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dob;
	
	@Column(name = "Gender")
	private String Gender;
	@Column(name = "Address")
	private String Address;
	@Column(name = "PhoneNo")
	private String PhoneNo;
	@Column(name = "LoginStatus")
	private int LoginStatus;
	
	@Column(name = "Logintype")
	private String Logintype;
	
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
//	public int getAge() {
//		return Age;
//	}
//	public void setAge(int age) {
//		Age = age;
//	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public int getLoginStatus() {
		return LoginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		LoginStatus = loginStatus;
	}
	
	
	
	public String getLogintype() {
		return Logintype;
	}
	public void setLogintype(String logintype) {
		Logintype = logintype;
	}
	
	
	

	public User(Long userID, String password, String firstName, String lastName, Date dob, String gender,
			String address, String phoneNo, int loginStatus, String logintype) {
		super();
		UserID = userID;
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		
		this.dob = dob;
		Gender = gender;
		Address = address;
		PhoneNo = phoneNo;
		LoginStatus = loginStatus;
		Logintype = logintype;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String password, String firstName, String lastName, Date dob, String gender, String address,
			String phoneNo, int loginStatus, String logintype) {
		super();
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		
		this.dob = dob;
		Gender = gender;
		Address = address;
		PhoneNo = phoneNo;
		LoginStatus = loginStatus;
		Logintype = logintype;
	}


	}
	
	
	
