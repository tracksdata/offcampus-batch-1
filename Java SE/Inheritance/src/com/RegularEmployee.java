package com;

public class RegularEmployee extends Employee{
	
	private int noOfDays;
	private int dayCost;

	public RegularEmployee(int noOfDays, int dayCost) {
		this.noOfDays = noOfDays;
		this.dayCost = dayCost;
	}

	public void addEmployee(int empId, String empName) {
		System.out.println(">>> RegularEmployee addEmployee");
		super.addEmployee(empId,empName); // super class method addEmployee
	}

	

}
