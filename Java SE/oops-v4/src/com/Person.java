package com;



public class Person{
	
	
	int x=10;
	float y=20.65f;
	String str="Abc";
	
	/*
	 * 1. simple type : one value type
	 *    ex: Integer
	 * 2. complex type : more than one value type
	 *    ex: Student
	 */
	

	public int hashCode() {
		// TODO Auto-generated method stub
		return x;
	}
	
	public String toString() {
		
		return "X: "+x+" and Y: "+y+" and str: "+str;
	}
	public static void main(String[] args) {
		
		Person p1=new Person();
		Person p2=new Person();
		//p.f1();
		
		System.out.println(p1); // toString is invoked by Compiler
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		if(p1.hashCode()==p2.hashCode()) {
			System.out.println("Eual");
		}else {
			System.out.println("Not");
		}
		
	}

}
