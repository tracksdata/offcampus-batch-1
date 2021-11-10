package com;
public class Person {
	
	/*
	 * -> JVM adds default constructor on its own when you don't provide
	 *    default constructor
	 * -> JVM never adds default constructor when you provide
	 *    parametarized constructor
	 */
	
	private int id; // 0
	private String name; // null
	private int age; // 0
	private char gender; // blank value
	private boolean isIndian; // false
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(isIndian);
	}
	
	
	
	public Person(int id) {
		this.id = id;
	}



	public Person(int id, String name, int age, char gender, boolean isIndian) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isIndian = isIndian;
	}




	public static void main(String[] args) throws Exception{

		
		Person p1=new Person(10,"Praveen",98,'M',true);
		
		p1.display();
	}

}
