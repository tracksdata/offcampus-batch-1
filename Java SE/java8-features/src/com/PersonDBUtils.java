package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDBUtils {

	private static List<Person> persons;

	// save
	public void save(Person person) {

		if (persons.size() == 0) {
			persons = new ArrayList<Person>();
			persons.add(person);
		} else {
			persons.add(person);
		}
	}

	// find all
	public List<Person> findAll() {
		return persons;
	}

	// find by ID V1
	public Person findById(int id) {

		for (Person person : persons) {
			if (person.getId() == id) {
				return person;
			}
		}

		return null;
	}

	// find by ID V1
	public Person findByIdV1(int id) {

		 Person p1= persons.stream()
		 .filter(person->person.getId()==id)
		 .findFirst()
		 .orElse(null);
		 
		 return p1;
		 
	}

}











