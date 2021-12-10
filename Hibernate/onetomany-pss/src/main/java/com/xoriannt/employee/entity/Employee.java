package com.xoriannt.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}

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
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	

}
