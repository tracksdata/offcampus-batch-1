package com;

public class UseClass {

	public static void main(String[] args) {
		
		Person p1=new Person();
		Person p2=new Person();

		
		p1.setId(10);
		p1.setName("James");
		p1.setAge(46);
		p1.setGender(Gender.Male);
		
		
		p2.setId(11);
		p2.setName("Rose");
		p2.setAge(87);
		p2.setGender(Gender.Female);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
