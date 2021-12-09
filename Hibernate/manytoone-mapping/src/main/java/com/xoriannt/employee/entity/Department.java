package com.xoriannt.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="department")
public class Department {

	@Id
	@GeneratedValue
	private int deptId;
	private String deptName;
	private String deptLoc;
	


	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, String deptLoc) {
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}

}
