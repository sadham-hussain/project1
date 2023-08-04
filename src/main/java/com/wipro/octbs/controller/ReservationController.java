package com.wipro.octbs.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.octbs.model.Movie;
import com.wipro.octbs.model.Reservation;
import com.wipro.octbs.model.Show;
import com.wipro.octbs.model.Theatre;
import com.wipro.octbs.model.CreditCard;
import com.wipro.octbs.service.CreditCardService;
import com.wipro.octbs.service.MovieService;
import com.wipro.octbs.service.ReservationService;
import com.wipro.octbs.service.ShowService;
import com.wipro.octbs.service.TheatreService;

@Controller
public class ReservationController {
	private float TotalPrice;
	@Autowired
	private ReservationService ReservationServ;
	@Autowired
	private ShowService ShowServ;
	@Autowired
	private TheatreService TheatreServ;
	@Autowired
	private MovieService MovieServ;
	@Autowired
	private CreditCardService CardServ;
	
	private Long selectedReservation;
	
	@RequestMapping(value="/Reservation",method=RequestMethod.POST)
	public String ReservationPage(ModelMap model,@RequestParam Long UserID,@RequestParam Long ShowID,@RequestParam int NoOfSeats,@RequestParam int SeatNoFrom,@RequestParam int SeatNoTo) {
		Reservation newReservation = new Reservation(1l,UserID,ShowID,NoOfSeats,SeatNoFrom,SeatNoTo);
		Reservation saved = ReservationServ.SaveReservation(newReservation);
		model.put("ReservationID", "Your Reservation ID is "+saved.getReservationID());
		return "Reservation";
	}
	
	@RequestMapping(value="/ViewReservation",method=RequestMethod.GET)
	public String ViewReservation(ModelMap model) {
		List<Reservation> ReservationList = ReservationServ.getAllReservations();
		model.put("ReservationList", ReservationList);
		return "ViewReservation";
	}
	
	@RequestMapping(value="/ViewReservationListReload",method=RequestMethod.GET)
	public String ViewReservationListReload(ModelMap model,@RequestParam Long SelectedReservation) {
		selectedReservation = SelectedReservation;
		Reservation viewReservation = ReservationServ.getReservationByID(SelectedReservation);
		Show show = ShowServ.getShowByID(viewReservation.getShowID());
		Movie movie = MovieServ.getMovieByID(show.getMovieID());
		Theatre theatre = TheatreServ.getTheatreByID(show.getTheatreID());
		model.put("TheatreName", theatre.getTheatreName());
		model.put("MovieName", movie.getMovieName());
		model.put("TimeSlot", show.getTimeSlot());
		model.put("NoOfSeats", viewReservation.getNoOfSeats());
		model.put("SeatNoFrom", viewReservation.getSeatNoFrom());
		model.put("SeatNoTo", viewReservation.getSeatNoTo());
		List<Reservation> ReservationList = ReservationServ.getAllReservations();
		model.put("ReservationList", ReservationList);
		return "ViewReservation";
	}
	
	@RequestMapping(value="/PrintReservation",method=RequestMethod.GET)
	public String PrintReservation(ModelMap model) throws IOException {
		Reservation viewReservation = ReservationServ.getReservationByID(selectedReservation);
		Show show = ShowServ.getShowByID(viewReservation.getShowID());
		Movie movie = MovieServ.getMovieByID(show.getMovieID());
		Theatre theatre = TheatreServ.getTheatreByID(show.getTheatreID());
		File ReservationFile = new File("Reservation.txt");
		ReservationFile.createNewFile();
		FileWriter out = new FileWriter("Reservation.txt");
		out.write("Reservation Details\n");
		out.write("Reservation ID : "+ viewReservation.getReservationID()+"\n");
		out.write("Theatre Name : "+theatre.getTheatreName()+"\n");
		out.write("Movie Name : "+movie.getMovieName()+"\n");
		out.write("Time Slot : "+show.getTimeSlot()+"\n");
		out.write("No Of Seats : "+viewReservation.getNoOfSeats()+"\n");
		out.write("Seats : "+viewReservation.getSeatNoFrom()+" - "+viewReservation.getSeatNoTo()+"\n");
		out.close();
		List<Reservation> ReservationList = ReservationServ.getAllReservations();
		model.put("ReservationList", ReservationList);
		return "ViewReservation";
	}
	
	@RequestMapping(value="/CreditCard",method=RequestMethod.GET)
	public String CreditCard(ModelMap model) {
		Reservation reservation = ReservationServ.getReservationByID(selectedReservation);
		Show show = ShowServ.getShowByID(reservation.getShowID());
		model.put("ReservationID", selectedReservation);
		model.put("NoOfSeats", reservation.getNoOfSeats());
		model.put("PricePerSeat", show.getPricePerSeat());
		TotalPrice = reservation.getNoOfSeats()*show.getPricePerSeat();
		model.put("TotalPrice", TotalPrice);
		return "CreditCard";
	}
	
	@RequestMapping(value="/Payment",method=RequestMethod.GET)
	public String Payment(ModelMap model) {
		model.put("Amount", TotalPrice);
		return "Payment";
	}
	@RequestMapping(value="/Payment",method=RequestMethod.POST)
	public String PaymentStatus(ModelMap model,@RequestParam Long CreditCardNumber,@RequestParam String ValidFrom,@RequestParam String ValidTo,@RequestParam int Pin) {
		if(CardServ.CreditCardExists(CreditCardNumber)) {
			CreditCard card = CardServ.GetCreditCardDetails(CreditCardNumber);
			if(card.getValidFrom().equals(ValidFrom)&&card.getValidTo().equals(ValidTo)){
				if(card.getPin()==Pin) {
					model.put("ErrorMsg", "Payment Succesful.");
					card.setBalance(card.getBalance()-TotalPrice);
					CardServ.SaveCreditCardDetails(card);
					return "CreditCard";
				}
				else {
					model.put("ErrorMsg", "Wrong Pin.");
					return "Payment";
				}
			}
			else {
				model.put("ErrorMsg", "Wrong Dates.");
				return "Payment";
			}
		}
		else {
			model.put("ErrorMsg", "Wrong card number.");
			return "Payment";
		}
		
	}
	@RequestMapping(value="/Cancel",method=RequestMethod.GET)
	public String Cancel(ModelMap model) {
		Reservation reservation = ReservationServ.getReservationByID(selectedReservation);
		ReservationServ.DeleteReservation(selectedReservation);
		List<Reservation> ReservationList = ReservationServ.getAllReservations();
		model.put("ReservationList", ReservationList);
		return "ViewReservation";
	}
}
