package com.wipro.octbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TheatreDetails")
public class Theatre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long TheatreID;
	@Column(name = "TheatreName")
	private String TheatreName;
	@Column(name = "MetroLocation")
	private String MetroLocation;
	@Column(name = "District")
	private String District;
	@Column(name = "NoOfShows")
	private int NoOfShows;
	@Column(name = "SeatCapacity")
	private int SeatCapacity;
	@Column(name = "ReservationCapacityRegular")
	private int ReservationCapacityRegular;
	public Long getTheatreID() {
		return TheatreID;
	}
	public void setTheatreID(Long theatreID) {
		TheatreID = theatreID;
	}
	public String getTheatreName() {
		return TheatreName;
	}
	public void setTheatreName(String theatreName) {
		TheatreName = theatreName;
	}
	public String getMetroLocation() {
		return MetroLocation;
	}
	public void setMetroLocation(String metroLocation) {
		MetroLocation = metroLocation;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getNoOfShows() {
		return NoOfShows;
	}
	public void setNoOfShows(int noOfShows) {
		NoOfShows = noOfShows;
	}
	public int getSeatCapacity() {
		return SeatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		SeatCapacity = seatCapacity;
	}
	public int getReservationCapacityRegular() {
		return ReservationCapacityRegular;
	}
	public void setReservationCapacityRegular(int reservationCapacityRegular) {
		ReservationCapacityRegular = reservationCapacityRegular;
	}
	@Override
	public String toString() {
		return "Theatre [TheatreID=" + TheatreID + ", TheatreName=" + TheatreName + ", MetroLocation=" + MetroLocation
				+ ", District=" + District + ", NoOfShows=" + NoOfShows + ", SeatCapacity=" + SeatCapacity
				+ ", ReservationCapacityRegular=" + ReservationCapacityRegular + "]";
	}
	public Theatre() {}
	public Theatre(Long theatreID, String theatreName, String metroLocation, String district, int noOfShows,
			int seatCapacity, int reservationCapacityRegular) {
		super();
		TheatreID = theatreID;
		TheatreName = theatreName;
		MetroLocation = metroLocation;
		District = district;
		NoOfShows = noOfShows;
		SeatCapacity = seatCapacity;
		ReservationCapacityRegular = reservationCapacityRegular;
	}
	
}
