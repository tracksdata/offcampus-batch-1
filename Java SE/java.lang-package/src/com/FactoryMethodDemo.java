package com;

import java.util.Scanner;

public class FactoryMethodDemo {
	
	public static void main(String[] args)throws Exception {
		
		
		System.out.println("Enter a class name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
	
		Class<?> clsName = Class.forName(name);
		System.out.println(clsName);
		@SuppressWarnings("deprecation")
		Object obj=clsName.newInstance();
		
		if (obj instanceof Employee) {
			Employee e1 = (Employee) obj;
			e1.f1();
		}
		if (obj instanceof Person) {
			Person p1 = (Person) obj;
			p1.f1();
		}

		sc.close();
		
		
		
		
	}

}
