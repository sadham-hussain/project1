package com.wipro.octbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MovieDetails")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long MovieID;
	@Column(name="MovieName")
	private String MovieName;
	@Column(name="Language")
	private String Language;
	@Column(name="Duration")
	private float Duration;
	public Long getMovieID() {
		return MovieID;
	}
	public void setMovieID(Long movieID) {
		MovieID = movieID;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public float getDuration() {
		return Duration;
	}
	public void setDuration(float duration) {
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Movie [MovieID=" + MovieID + ", MovieName=" + MovieName + ", Language=" + Language + ", Duration="
				+ Duration + "]";
	}
	public Movie() {}
	public Movie(Long movieID, String movieName, String language, float duration) {
		super();
		MovieID = movieID;
		MovieName = movieName;
		Language = language;
		Duration = duration;
	}
}
