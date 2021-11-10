package com;

// POJO/Model/Bean/Entity - Plain old java object
public class Employee {
	
	// 1. define all properties as 'private'
	private int empId; // setEmpId, getEmpId
	private String empName; // setEmpName, getEmpName
	private double salary; // setSalary, getSalary
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		
		// calculations..
		
		return salary;
	}
	public void setSalary(double salary) {
		// .. validation
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
	}
	
	
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
	
	
	// 2. define all method with 'public' and 
	      // with getters and setters
	
	/*
	 * Setters
	 * --------
	 * -> setters does not have return type, but 
	 *    have parameter
	 *  Getters
	 *  -------
	 *  -> getters does not have parameters, but
	 *    have return type
	 */
	
	
	
	
	
	
	
	

}
