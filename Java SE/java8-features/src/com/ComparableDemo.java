package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		Person p1 = new Person(120, "Praveen");
		Person p2 = new Person(231, "James");
		Person p3 = new Person(156, "Abbas");
		Person p4 = new Person(123, "Ritam");
		Person p5 = new Person(221, "Charmi");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

		// List<Person> persons=new ArrayList<Person>();
		// persons.add(p1);
		// Collections.sort(persons);

		System.out.println(persons);
		
		Comparator<Person> obj=new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
		}.reversed();
		
		//obj.reversed();
		Collections.sort(persons,obj);
		System.out.println(">>> "+persons);
		
		
		
		persons.sort((obj1, obj2) -> obj1.getId() - obj2.getId());
		System.out.println(persons);

		persons.sort((obj1, obj2) -> obj1.getName().compareTo(obj2.getName()));
		
		
		System.out.println(persons);

	}

}
