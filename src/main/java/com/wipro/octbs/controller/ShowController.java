package com.wipro.octbs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.octbs.model.Movie;
import com.wipro.octbs.model.Show;
import com.wipro.octbs.model.Theatre;
import com.wipro.octbs.service.MovieService;
import com.wipro.octbs.service.ShowService;
import com.wipro.octbs.service.TheatreService;

@Controller
public class ShowController {
	@Autowired
	private ShowService ShowServ;
	@Autowired
	private MovieService MovieServ;
	@Autowired
	private TheatreService TheatreServ;
	private Long selectedShow;
	
	@RequestMapping(value="/AddShow",method=RequestMethod.GET)
	public String AddShowPage(ModelMap model) {
		List<Movie> MovieList = MovieServ.getAllMovies();
		model.put("MovieList", MovieList);
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "AddShow";
	}
	
	@RequestMapping(value="/EditShow",method=RequestMethod.GET)
	public String EditShowPage(ModelMap model) {
		List<Show> ShowList = ShowServ.getAllShows();
		model.put("ShowList", ShowList);
		return "EditShow";
	}
	
	@RequestMapping(value="/ViewShow",method=RequestMethod.GET)
	public String ViewMoviePage(ModelMap model) {
		List<Show> ShowList = ShowServ.getAllShows();
		ListIterator<Show> itr = ShowList.listIterator();
		List<Show> SelectedShowList = new ArrayList<Show>();
		while(itr.hasNext()) {
			Show show = itr.next();
			if(show.getTheatreID()==TheatreController.selectedTheatre) {
				SelectedShowList.add(show);
				System.out.println(show);
			}
		}
		model.put("ShowList", SelectedShowList);
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		return "TicketBooking";
	}
	
	@RequestMapping(value="/DeleteShow",method=RequestMethod.GET)
	public String DeleteShowPage(ModelMap model) {
		List<Show> ShowList = ShowServ.getAllShows();
		model.put("ShowList", ShowList);
		return "DeleteShow";
	}
	
	@RequestMapping(value="/AddShow",method=RequestMethod.POST)
	public String AddShow(ModelMap model,@RequestParam Long SelectedTheatre,@RequestParam Long SelectedMovie,@RequestParam String TimeSlot,@RequestParam float PricePerSeat,@RequestParam int RegularSeats_Available) {
		Show newShow = new Show(1l,SelectedTheatre,SelectedMovie,TimeSlot,PricePerSeat,RegularSeats_Available);
		Show addedShow = ShowServ.saveShowDetails(newShow);
		model.put("GeneratedID", "Generated ID is "+addedShow.getShowID());
		return "AddShow";
	}
	
	@RequestMapping(value="/EditShowListReload",method=RequestMethod.GET)
	public String EditShowListReload(ModelMap model,@RequestParam Long SelectedShow) {
		selectedShow = SelectedShow;
		Show editShow = ShowServ.getShowByID(SelectedShow);
		model.put("TheatreID",editShow.getTheatreID());
		Theatre theatre = TheatreServ.getTheatreByID(editShow.getTheatreID());
		model.put("TheatreName",theatre.getTheatreName());
		model.put("MovieID",editShow.getMovieID());
		Movie movie = MovieServ.getMovieByID(editShow.getMovieID());
		model.put("MovieName",movie.getMovieName());
		model.put("TimeSlot", editShow.getTimeSlot());
		model.put("PricePerSeat",editShow.getPricePerSeat());
		model.put("RegularSeats_Available", editShow.getRegularSeats_Available());
		List<Show> ShowList = ShowServ.getAllShows();
		model.put("ShowList", ShowList);
		return "EditShow";
	}
	
	@RequestMapping(value="/EditShow",method=RequestMethod.POST)
	public String EditShow(ModelMap model,@RequestParam Long SelectedTheatre,@RequestParam Long SelectedMovie,@RequestParam String TimeSlot,@RequestParam float PricePerSeat,@RequestParam int RegularSeats_Available) {
		Show editShow = ShowServ.getShowByID(selectedShow);
		editShow.setTheatreID(SelectedTheatre);
		editShow.setMovieID(SelectedMovie);
		editShow.setTimeSlot(TimeSlot);
		editShow.setPricePerSeat(PricePerSeat);
		editShow.setRegularSeats_Available(RegularSeats_Available);
		ShowServ.saveShowDetails(editShow);
		List<Show> ShowList = ShowServ.getAllShows();
		model.put("ShowList", ShowList);
		return "EditShow";
	}
	
	@RequestMapping(value="/DeleteShowListReload",method=RequestMethod.GET)
	public String DeleteShowListReload(ModelMap model,@RequestParam Long SelectedShow) {
		selectedShow = SelectedShow;
		Show deleteShow = ShowServ.getShowByID(selectedShow);
		Theatre theatre = TheatreServ.getTheatreByID(deleteShow.getTheatreID());
		model.put("TheatreName",theatre.getTheatreName());
		Movie movie = MovieServ.getMovieByID(deleteShow.getMovieID());
		model.put("MovieName",movie.getMovieName());
		model.put("TimeSlot", deleteShow.getTimeSlot());
		model.put("PricePerSeat", deleteShow.getPricePerSeat());
		model.put("RegularSeats_Available", deleteShow.getRegularSeats_Available());
		List<Show> ShowList = ShowServ.getAllShows();
		model.put("ShowList", ShowList);
		return "DeleteShow";
	}
	
	@RequestMapping(value="/DeleteShow",method=RequestMethod.POST)
	public String DeleteShow(ModelMap model) {
		ShowServ.deleteShowByID(selectedShow);
		List<Show> ShowList = ShowServ.getAllShows();
		model.put("ShowList", ShowList);
		return "DeleteShow";
	}
	
	@RequestMapping(value="/ViewShowListReload",method=RequestMethod.GET)
	public String ViewShowListReload(ModelMap model,@RequestParam String SelectedShow) {
		selectedShow = Long.parseLong(SelectedShow);
		List<Show> ShowList = ShowServ.getAllShows();
		ListIterator<Show> itr = ShowList.listIterator();
		List<Show> SelectedShowList = new ArrayList<Show>();
		while(itr.hasNext()) {
			Show show = itr.next();
			if(show.getTheatreID()==TheatreController.selectedTheatre) {
				SelectedShowList.add(show);
				System.out.println(show);
			}
		}
		model.put("ShowList", SelectedShowList);
		List<Theatre> theatreList = TheatreServ.getAllTheatres();
		model.put("TheatreList", theatreList);
		Show selectedShow = ShowServ.getShowByID(Long.parseLong(SelectedShow));
		Movie movie = MovieServ.getMovieByID(selectedShow.getMovieID());
		model.put("MovieName", movie.getMovieName());
		model.put("Language", movie.getLanguage());
		model.put("TimeSlot", selectedShow.getTimeSlot());
		model.put("PricePerSeat", selectedShow.getPricePerSeat());
		return "TicketBooking";
	}
	
	@RequestMapping(value="/Reservation",method=RequestMethod.GET)
	public String ReservationPage(ModelMap model) {
		model.put("UserID", LoginController.LoginUser);
		Show show = ShowServ.getShowByID(selectedShow);
		model.put("ShowID", show.getShowID());
		return "Reservation";
	}
}
