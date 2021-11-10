package com;

public class Car {
	
	private int speed;
	private int gare;
	
	private Driver driver;
	
	
	
	

	
	public String toString() {
		return "Car [speed=" + speed + ", gare=" + gare + ", driver=" + driver + "]";
	}

	public Car(Driver driver) {
		super();
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGare() {
		return gare;
	}

	public void setGare(int gare) {
		this.gare = gare;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	// .. setters and getters
	
	
}
