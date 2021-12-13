package com.xoriannt.employee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private long phoneNumber;

	@Transient
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "student_details", joinColumns = @JoinColumn(name = "studentId"), inverseJoinColumns = @JoinColumn(name = "couseId"))
	private List<Course> courses = new ArrayList<Course>();

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, long phoneNumber) {
		super();
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}
