package com.wipro.octbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ReservationID;
	@Column(name="UserID")
	private Long UserID;
	@Column(name="ShowID")
	private Long ShowID;
	@Column(name="NoOfSeats")
	private int NoOfSeats;
	@Column(name="SeatNoFrom")
	private int SeatNoFrom;
	@Column(name="SeatNoTo")
	private int SeatNoTo;
	public Long getReservationID() {
		return ReservationID;
	}
	public void setReservationID(Long reservationID) {
		ReservationID = reservationID;
	}
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public Long getShowID() {
		return ShowID;
	}
	public void setShowID(Long showID) {
		ShowID = showID;
	}
	public int getNoOfSeats() {
		return NoOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		NoOfSeats = noOfSeats;
	}
	public int getSeatNoFrom() {
		return SeatNoFrom;
	}
	public void setSeatNoFrom(int seatNoFrom) {
		SeatNoFrom = seatNoFrom;
	}
	public int getSeatNoTo() {
		return SeatNoTo;
	}
	public void setSeatNoTo(int seatNoTo) {
		SeatNoTo = seatNoTo;
	}
	public Reservation() {}
	public Reservation(Long reservationID, Long userID, Long showID, int noOfSeats, int seatNoFrom, int seatNoTo) {
		super();
		ReservationID = reservationID;
		UserID = userID;
		ShowID = showID;
		NoOfSeats = noOfSeats;
		SeatNoFrom = seatNoFrom;
		SeatNoTo = seatNoTo;
	}
	@Override
	public String toString() {
		return "Reservation [ReservationID=" + ReservationID + ", UserID=" + UserID + ", ShowID=" + ShowID
				+ ", NoOfSeats=" + NoOfSeats + ", SeatNoFrom=" + SeatNoFrom + ", SeatNoTo=" + SeatNoTo + "]";
	}
	
}
