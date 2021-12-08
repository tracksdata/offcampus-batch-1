package com.xoriannt.product.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "s1",strategy = "com.xoriannt.product.config.CustomPkGen")
public class Customer {
	@Id
	@GeneratedValue(generator = "s1")
	private String custId; // ABCHYD202112090001
	private String custName;
	private int age;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
