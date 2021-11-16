package com;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;

	public Employee() {
		System.out.println(">>> Employee class object created");
	}
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee) obj;
		if(emp.getEmpId()==empId && emp.getEmpName().equals(empName) && emp.getSalary()==salary) {
			return true;
		}
		return super.equals(obj);
	}
	
	

	public void f1() {
		System.out.println(">>> f1 method of employee");
	}
	
	public void f2() {}

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
