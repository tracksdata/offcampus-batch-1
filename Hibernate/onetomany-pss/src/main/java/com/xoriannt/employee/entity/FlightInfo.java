package com.xoriannt.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "flight_info")
public class FlightInfo {

	@Id
	@GeneratedValue
	@Column(name = "flight_id")
	private int flightId;
	@Column(name = "flight_type")
	private String flightType;
	@Column(name = "flight_number")
	private String flightNumber;
	@Column(name = "seat_capacity")
	private int seatCapacity;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "FlightInfo [flightId=" + flightId + ", flightType=" + flightType + ", flightNumber=" + flightNumber
				+ ", seatCapacity=" + seatCapacity + "]";
	}

}
