package com;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private double salary;
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return empId-emp.getEmpId();
	}
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	public static void display(List<Employee> emps) {
		
		System.out.println("--------------------------------");
		System.out.println("EmpId\tEmployee Name\tSalary");
		System.out.println("--------------------------------");
		for(Employee emp:emps) {
			System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t\t"+emp.getSalary());
		}
		System.out.println();
	}
}
