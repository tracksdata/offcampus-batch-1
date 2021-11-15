package com;

public class ContractEmployee extends Employee {

	private int noOfHours;
	private int hourCost;

	public ContractEmployee(int noOfHours, int hourCost) {
		this.noOfHours = noOfHours;
		this.hourCost = hourCost;
	}

	public void addEmployee(int empId, String empName) {
		super.addEmployee(empId, empName); // super class method addEmployee
	}

	@Override
	public void processSalary() {
		setSalary(noOfHours * hourCost);

	}

}
