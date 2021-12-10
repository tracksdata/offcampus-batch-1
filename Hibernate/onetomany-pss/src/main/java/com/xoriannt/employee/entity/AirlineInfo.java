package com.xoriannt.employee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity(name = "airline_info")
public class AirlineInfo {

	@Id
	@GeneratedValue
	@Column(name = "airline_info_id")
	private int airlineInfoId;
	@Column(name = "airline_name")
	private String airlineName;
	@Column(name = "airline_logo")
	private String airlineLogo;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "flights", joinColumns = { @JoinColumn(name = "airline_info_id") }, inverseJoinColumns = {
			@JoinColumn(name = "flight_id") })
	private List<FlightInfo> flight_details = new ArrayList<FlightInfo>();

	public List<FlightInfo> getFlight_details() {
		return flight_details;
	}

	@OneToOne()
	public void setFlight_details(List<FlightInfo> flight_details) {
		this.flight_details = flight_details;
	}

	public int getAirlineInfoId() {
		return airlineInfoId;
	}

	public void setAirlineInfoId(int airlineInfoId) {
		this.airlineInfoId = airlineInfoId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineLogo() {
		return airlineLogo;
	}

	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}

}
