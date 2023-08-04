package com.wipro.octbs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.octbs.model.Theatre;
import com.wipro.octbs.service.TheatreService;

@Controller
public class TheatreController {
	static Long selectedTheatre; 
	@Autowired
	private TheatreService TheatreServ;
	
	@RequestMapping(value="/AddTheatre",method=RequestMethod.GET)
	public String AddTheatrePage() {
		return "AddTheatre";
	}
	
	@RequestMapping(value="/EditTheatre",method=RequestMethod.GET)
	public String EditTheatrePage(ModelMap model) {
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "EditTheatre";
	}
	
	@RequestMapping(value="/DeleteTheatre",method=RequestMethod.GET)
	public String DeleteTheatrePage(ModelMap model) {
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "DeleteTheatre";
	}
	
	@RequestMapping(value="/AddTheatre",method=RequestMethod.POST)
	public String AddTheatre(ModelMap model,@RequestParam String TheatreName,@RequestParam String MetroLocation,@RequestParam String District,@RequestParam int NumberOfShows,@RequestParam int SeatingCapacity,@RequestParam int ReservationCapacityRegular) {
		Theatre newTheatre = new Theatre(1l,TheatreName,MetroLocation,District,NumberOfShows,SeatingCapacity,ReservationCapacityRegular);
		Theatre addedTheatre = TheatreServ.saveTheatreDetails(newTheatre);
		model.put("GeneratedID", "Generated ID is "+addedTheatre.getTheatreID());
		return "AddTheatre";
	}
	
	@RequestMapping(value="/EditTheatreListReload",method=RequestMethod.GET)
	public String EditTheatreListReload(ModelMap model,@RequestParam Long SelectedTheatre) {
		selectedTheatre = SelectedTheatre;
		Theatre editTheatre = TheatreServ.getTheatreByID(SelectedTheatre);
		model.put("TheatreName",editTheatre.getTheatreName());
		model.put("MetroLocation",editTheatre.getMetroLocation());
		model.put("District",editTheatre.getDistrict());
		model.put("NumberOfShows",editTheatre.getNoOfShows());
		model.put("SeatingCapacity",editTheatre.getSeatCapacity());
		model.put("ReservationCapacityRegular",editTheatre.getReservationCapacityRegular());
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "EditTheatre";
	}
	
	@RequestMapping(value="/EditTheatre",method=RequestMethod.POST)
	public String EditTheatre(ModelMap model,@RequestParam String TheatreName,@RequestParam String MetroLocation,@RequestParam String District,@RequestParam int NumberOfShows,@RequestParam int SeatingCapacity,@RequestParam int ReservationCapacityRegular) {
		Theatre editTheatre = TheatreServ.getTheatreByID(selectedTheatre);
		editTheatre.setTheatreName(TheatreName);
		editTheatre.setMetroLocation(MetroLocation);
		editTheatre.setDistrict(District);
		editTheatre.setNoOfShows(NumberOfShows);
		editTheatre.setSeatCapacity(SeatingCapacity);
		editTheatre.setReservationCapacityRegular(ReservationCapacityRegular);
		TheatreServ.saveTheatreDetails(editTheatre);
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "EditTheatre";
	}
	
	@RequestMapping(value="/DeleteTheatreListReload",method=RequestMethod.GET)
	public String DeleteTheatreListReload(ModelMap model,@RequestParam Long SelectedTheatre) {
		selectedTheatre = SelectedTheatre;
		Theatre deleteTheatre = TheatreServ.getTheatreByID(SelectedTheatre);
		model.put("TheatreName",deleteTheatre.getTheatreName());
		model.put("MetroLocation",deleteTheatre.getMetroLocation());
		model.put("District",deleteTheatre.getDistrict());
		model.put("NumberOfShows",deleteTheatre.getNoOfShows());
		model.put("SeatingCapacity",deleteTheatre.getSeatCapacity());
		model.put("ReservationCapacityRegular",deleteTheatre.getReservationCapacityRegular());
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "DeleteTheatre";
	}
	
	@RequestMapping(value="/DeleteTheatre",method=RequestMethod.POST)
	public String DeleteTheatre(ModelMap model) {
		TheatreServ.deleteTheatreByID(selectedTheatre);
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "DeleteTheatre";
	}
	
	@RequestMapping(value="/ViewTheatreListReload",method=RequestMethod.GET)
	public String ViewTheatreListReload(ModelMap model,@RequestParam Long SelectedTheatre) {
		selectedTheatre = SelectedTheatre;
		Theatre viewTheatre = TheatreServ.getTheatreByID(SelectedTheatre);
		model.put("TheatreName",viewTheatre.getTheatreName());
		model.put("MetroLocation",viewTheatre.getMetroLocation());
		model.put("SeatingCapacity",viewTheatre.getSeatCapacity());
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		model.put("SelectedTheatre", selectedTheatre);
		return "TicketBooking";
	}
	
}
