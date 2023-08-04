package com.wipro.octbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ShowDetails")
public class Show {
	@Id
	
	private Long ShowID;
	@Column(name="TheatreID")
	private Long TheatreID;
	@Column(name="MovieID")
	private Long MovieID;
	@Column(name="TimeSlot")
	private String TimeSlot;
	@Column(name="PricePerSeat")
	private float PricePerSeat;
	@Column(name="RegularSeats_Available")
	private int RegularSeats_Available;
	public Long getShowID() {
		return ShowID;
	}
	public void setShowID(Long showID) {
		ShowID = showID;
	}
	public Long getTheatreID() {
		return TheatreID;
	}
	public void setTheatreID(Long theatreID) {
		TheatreID = theatreID;
	}
	public Long getMovieID() {
		return MovieID;
	}
	public void setMovieID(Long movieID) {
		MovieID = movieID;
	}
	public String getTimeSlot() {
		return TimeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		TimeSlot = timeSlot;
	}
	public float getPricePerSeat() {
		return PricePerSeat;
	}
	public void setPricePerSeat(float pricePerSeat) {
		PricePerSeat = pricePerSeat;
	}
	public int getRegularSeats_Available() {
		return RegularSeats_Available;
	}
	public void setRegularSeats_Available(int regularSeats_Available) {
		RegularSeats_Available = regularSeats_Available;
	}
	public Show() {}
	public Show(Long showID, Long theatreID, Long movieID, String timeSlot, float pricePerSeat,
			int regularSeats_Available) {
		super();
		ShowID = showID;
		TheatreID = theatreID;
		MovieID = movieID;
		TimeSlot = timeSlot;
		PricePerSeat = pricePerSeat;
		RegularSeats_Available = regularSeats_Available;
	}
	@Override
	public String toString() {
		return "Show [ShowID=" + ShowID + ", TheatreID=" + TheatreID + ", MovieID=" + MovieID + ", TimeSlot=" + TimeSlot
				+ ", PricePerSeat=" + PricePerSeat + ", RegularSeats_Available=" + RegularSeats_Available + "]";
	}
	
}
