package com.wipro.octbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.octbs.model.LoginCredentials;
import com.wipro.octbs.model.Theatre;
import com.wipro.octbs.model.User;
import com.wipro.octbs.service.LoginCredentialsService;
import com.wipro.octbs.service.TheatreService;
import com.wipro.octbs.service.UserService;

@Controller
public class LoginController {
	static Long LoginUser;
	@Autowired
	private LoginCredentialsService loginCredServ;
	@Autowired
	private UserService userServ;
	@Autowired
	private TheatreService TheatreServ;
	
	/*
	 * @GetMapping("/") public String log() { return "fpage"; }
	 */

	@GetMapping("/")
	public String fpage()
	{
		
		return "fpage";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@GetMapping("/cities")
	public String cities()
	{
		return "cities";
	}
	
	@GetMapping("/Login1")
	public String login1 ()
	{
		return "Login1";
	}
	
	
	@RequestMapping(value="/Login1",method=RequestMethod.POST)
	public String Login(ModelMap model,@RequestParam String UserID,@RequestParam String Password) 
	{
		Long p=0l;
		Long i;
		for(int j=0;j<UserID.length();j++)
		{
			char f = UserID.charAt(j); 
			if(Character.isAlphabetic(f)) {
			p=-1l;
			break;
			}
			else
				continue;
		}
		
		if(p==-1l)
			i=p;
		else {
		
		i=Long.parseLong(UserID);
		}
		
		String s="Admin";
		String s1="User";
		
		
		if(i<0)
		{
			model.put("errorMsg", "Please enter Correct UserID");
			return "Login1";
		}
		
		else if(userServ.userExists(i)) {
				User us =userServ.getUserByID(i);
				if(i.equals(us.getUserID()) && Password.equals(us.getPassword()) && (us.getLogintype().equals(s))) {
					System.out.println(us);
					us.setLoginStatus(1);
					userServ.saveUserDetails(us);
					return "AddTheatre";
				}
		
		else if(us.getUserID()==i && us.getPassword().equals(Password) && (us.getLogintype().equals(s1))) {
			User loginUser = userServ.getUserByID(i);
			
			if(userServ.userExists(i)) {
				loginUser = userServ.getUserByID(i);
				if(loginUser.getLoginStatus()==0) {
					if(loginUser.getUserID()==i && loginUser.getPassword().equals(Password) && (loginUser.getLogintype().equals(s1))) {
						List<Theatre> theatreList = TheatreServ.getAllTheatres();
						model.put("TheatreList", theatreList);
						LoginUser=i;
						loginUser.setLoginStatus(1);
						return "TicketBooking";
					}
					else {
						model.put("errorMsg", "You have entered invalid password. Please enter correct password.");
						return "Login1";
					}
				}
				else {
					model.put("errorMsg", "You are already logged in another Page.");
					return "Login1";
				}
			}
			else {
				model.put("errorMsg", "Your ID is invalid. Please create a new Account or enter correct ID");
				return "Login1";
			}
		
	}
			
			
	}
		model.put("errorMsg", "Please enter valid ID and Password");
		return "Login1";
	}
		
@RequestMapping(value="/Logout",method=RequestMethod.GET)
	public String Logout() {
		
		return "Login1";
	}	
	
	
}
