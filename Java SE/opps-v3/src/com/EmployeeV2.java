package com;


public class EmployeeV2 {
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
	
	
	static void display(EmployeeV2 emp) {
		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println("------------------------");
	}
	
	static void f1(int num) {
		num=num+100;
		System.out.println("In f1: "+num);
		
	}
	
	
	
	public static void main(String[] args) {
		EmployeeV2 e1=new EmployeeV2();
		EmployeeV2 e2=new EmployeeV2();
		EmployeeV2 e3=new EmployeeV2();
		
		/*
		System.out.println("e1 hashcode: "+e1.hashCode());
		System.out.println("e2 hashcode: "+e2.hashCode());
		System.out.println("e3 hashcode: "+e3.hashCode());
		
		System.out.println("------------------------------------------");
		
		System.out.println("e1 hashcode: "+System.identityHashCode(e1));
		System.out.println("e2 hashcode: "+System.identityHashCode(e2));
		System.out.println("e3 hashcode: "+System.identityHashCode(e3));
		
		*/

		//Registar r1=new Registar();
		
		Registar r1=Registar.getRegistar();
		Registar r2=Registar.getRegistar();
		Registar r3=Registar.getRegistar();

		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		
		//-----------------------------
		e1.addEmployee(1024,"Praveen",10000); // actual argument
		e2.addEmployee(1025,"Ozvitha",20000);
		e3.addEmployee(1026,"Bucky",30000);
		
		
		int x=100;
		System.out.println("Before f1: "+x);
		f1(x);
		System.out.println("After f1: "+x);
	
		ProcessEmployeeData.processSalary(e1);

	     display(e1);
	     display(e2);
	     display(e3);
	     
	     //System.out.println(Math.sqrt(100));
	     
		
		
		
	}

}
