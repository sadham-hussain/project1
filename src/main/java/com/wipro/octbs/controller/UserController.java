package com.wipro.octbs.controller;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.octbs.model.Theatre;
import com.wipro.octbs.model.User;
import com.wipro.octbs.service.TheatreService;
import com.wipro.octbs.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userServ;
	@Autowired
	private TheatreService TheatreServ;
	
	@RequestMapping(value="/UserRegistration",method = RequestMethod.POST)
	public String NewRegistration(ModelMap model,@RequestParam String FirstName,@RequestParam Date dob,@RequestParam String LastName,@RequestParam String Gender,@RequestParam String Address,@RequestParam String PhoneNo,@RequestParam String Password,@RequestParam String Logintype) {
	
		User newUser = new User(Password,FirstName,LastName,dob,Gender,Address,PhoneNo,0,Logintype);

		newUser.setUserID(num());
		User user = userServ.saveUserDetails(newUser);
		model.put("UserID", "Your UserID is "+user.getUserID());
		return "UserRegistration";
	}
	
	static long num()
	{
		long j=(long)Math.random()*20;
		return j;
	}
	@RequestMapping(value="/UserRegistration",method = RequestMethod.GET)
	public String UserRegistration() {
		return "UserRegistration";
	}
	@RequestMapping(value="/HomePage",method = RequestMethod.GET)
	public String HomePage(ModelMap model) {
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "TicketBooking";
	}
	

	}

