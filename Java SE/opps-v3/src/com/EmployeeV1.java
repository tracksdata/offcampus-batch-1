package com;


public class EmployeeV1 {
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
	
	static void processSalary(EmployeeV1 emp) {
		emp.salary=emp.salary+1500;
		System.out.println("In Method:: "+emp.salary);
	}
	
	static void display(EmployeeV1 emp) {
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
		EmployeeV1 e1=new EmployeeV1();
		EmployeeV1 e2=new EmployeeV1();
		EmployeeV1 e3=new EmployeeV1();
		
		//-----------------------------
		e1.addEmployee(1024,"Praveen",10000); // actual argument
		e2.addEmployee(1025,"Ozvitha",20000);
		e3.addEmployee(1026,"Bucky",30000);
		
		
		int x=100;
		System.out.println("Before f1: "+x);
		f1(x);
		System.out.println("After f1: "+x);
	
		
		//System.out.println("Before Cal:: "+e1.salary);
		processSalary(e1);
		processSalary(e2);
		processSalary(e3);
	//	System.out.println("After call :: "+e1.salary);
		
	     display(e1);
	     display(e2);
	     display(e3);
	     
	     //System.out.println(Math.sqrt(100));
	     
		
		
		
	}

}
