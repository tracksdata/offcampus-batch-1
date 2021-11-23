package com;

import java.io.Serializable;

public class Employee implements Serializable{


	private static final long serialVersionUID = 1024;
	private int empId;
	private String empName;
	private double salary;
	
	private transient String info;
	
	void f1() {}
	void f2() {}
	void f3() {}
	void f4() {}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary,String info) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.info=info;
	}
	
	

	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
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

}
