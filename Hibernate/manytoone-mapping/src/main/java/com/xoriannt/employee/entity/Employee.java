package com.xoriannt.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private double salary;

	//@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//@JoinColumn(name = "deptId")
	//@JoinTable(name="dept_details",
	//joinColumns = {@JoinColumn(name="empId")}
	             //  ,inverseJoinColumns = {@JoinColumn(name="deptId")})
	private Department dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
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
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}

}
