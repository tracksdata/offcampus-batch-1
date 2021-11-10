package com;

public class Driver {
	private int id;
	private String name;
	private String drivingLicenceNumber;
	private int yearsOfExperieance;
	
	

	public Driver(int id, String name, String drivingLicenceNumber, int yearsOfExperieance) {
		super();
		this.id = id;
		this.name = name;
		this.drivingLicenceNumber = drivingLicenceNumber;
		this.yearsOfExperieance = yearsOfExperieance;
	}
	
	

	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", drivingLicenceNumber=" + drivingLicenceNumber
				+ ", yearsOfExperieance=" + yearsOfExperieance + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}

	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}

	public int getYearsOfExperieance() {
		return yearsOfExperieance;
	}

	public void setYearsOfExperieance(int yearsOfExperieance) {
		this.yearsOfExperieance = yearsOfExperieance;
	}

	// getters and setters

}
