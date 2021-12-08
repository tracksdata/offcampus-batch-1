package com.xoriannt.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@SecondaryTable(name = "addr")

public class Person {

	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	private int age;

	@Column(table = "addr")
	private String hno;
	@Column(table = "addr")
	private String street;
	@Column(table = "addr")
	private String city;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(String personName, int age, String hno, String street, String city) {
		
		this.personName = personName;
		this.age = age;
		this.hno = hno;
		this.street = street;
		this.city = city;
	}




	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
