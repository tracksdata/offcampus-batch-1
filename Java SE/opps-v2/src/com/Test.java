package com;

public class Test {
	
	void fun() { // instance method
		Employee e1=new Employee();
		e1.empId=10;
		System.out.println(Employee.companyName);
		Employee.f2();
		
		
	}
	
	static void fun1() {
		Employee e2=new Employee();
		e2.empId=20;
		
		System.out.println(Employee.companyName);
		
		
	}

}
