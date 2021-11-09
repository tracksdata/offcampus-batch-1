package com;


public class Employee {
	int empId; // is class level variable
	double salary;
	String name;
	//-------------------
	
	// 1. accept data of above properties
	void addEmployee(int empId,String name,double salary) { // formal argument
		// all formal arguments are local variables to the method
		// here empId is a local variable with in addEmployee method
		 this.empId=empId;	
		 this.name=name;
		 this.salary=salary;
		 // 'this' represents instance or current class object (employee)
	}
	
	
	void processSalary(double bonus) {
		//this.salary=this.salary+bonus;
		salary=salary+bonus;
	}
	
	// display employee data
	void display() {
		System.out.println("Employee ID:: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		//-----------------------------
		e1.addEmployee(1024,"Praveen",10000); // actual argument
		e2.addEmployee(1025,"Ozvitha",20000);
		e3.addEmployee(1026,"Bucky",30000);
		
		e1.processSalary(10000);
		e2.processSalary(5000);
		e3.processSalary(2000);
		
		e1.display();
		e2.display();
		e3.display();
		
		
		
		
	}

}
