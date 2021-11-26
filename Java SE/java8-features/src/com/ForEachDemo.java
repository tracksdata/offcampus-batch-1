package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Sayable{  
    void say();  
} 

interface SayableV1{  
    void say();  
} 

interface Demo{
	String getMessage();
}

public class ForEachDemo {

	public static void f1() {
		System.out.println("Welcome to java8");
	}
	
	public  void f3() {
		System.out.println("Welcome to java8 ==>  instance ...");
	}

	public static String f2() {
		return "Welcome to java8 ==> return ";
	}

	public static void main(String[] args) {

		Person p1 = new Person(120, "Praveen");
		Person p2 = new Person(231, "James");
		Person p3 = new Person(156, "Abbas");
		Person p4 = new Person(123, "Ritam");
		Person p5 = new Person(221, "Charmi");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

		// for(Person p:persons) {
		// System.out.println(p);
		// }

		// persons.forEach(p->{
		// System.out.println(p);
		// });

		//persons.forEach(System.out::println);

		//ForEachDemo fd = new ForEachDemo();
		// System.out.println(fd.f1());
		
		Sayable s1= ForEachDemo::f1;
		s1.say();
		
		Demo d= ForEachDemo::f2;
		
		String str = d.getMessage();
		System.out.println(str);
		
		ForEachDemo fd=new ForEachDemo();
		SayableV1 v1= fd::f3;
		v1.say();
		v1.say();
		v1.say();
		

	}

}
