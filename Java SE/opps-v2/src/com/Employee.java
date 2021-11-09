package com;


public class Employee{
	
	
	//---------------------------------
	// 1. properties - behaviour
	// 2. methods    - actions 
	// 3. constructors
	// 4. inner classes
	// 5. interfaces
	// 6. blocked scope
	
	//---------------------------------
	
	/*
	 * 1. fields / properties / variables
	 * ==================================
	 *  => instance variables
	 *  => static variables
	 *  => final variables
	 *  => volatile variables
	 *  
	 *  
	 * 2. methods
	 * ================
	 * => instance methods
	 * => static methods
	 * => final methods
	 * => abstract methods
	 * => native methods
	 * 
	 * constructors
	 * =============
	 * => default constructor
	 * => parameterised constructor
	 * 
	 * blocked scope
	 * ==================
	 * => instance blocks
	 * => static blocks
	 * 
	 */
	
	
	int empId; // instance 
	double salary; // instance
	String empName; // instance
	
	static String companyName="Xoriant";
	static String managerName="John";
	static String projectName="Ford";
	
	
	void display() { // instance
		System.out.println("EmpID: "+empId);
		System.out.println("EMpName: "+empName);
		System.out.println("Company Name: "+companyName);
	}
	
	static void f2() { // static
		Employee e1=new Employee();
		e1.empId=1027;
		System.out.println(e1.empId);
		System.out.println(companyName);
	
	}
	
	static void displayData(Employee emp) {
		System.out.println(companyName);
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println("------------------------");
	}
	
	
	static {
		System.out.println(">>> statement 1");
	}
	
	static {
		System.out.println(">>> statement 2");
	}
	
	
	
	/*
	 * 
	 * instance variables:
	 * -------------------
	 * => data of a instance is individual to an object

	 * 
	 * static variables
	 * -----------------
	 * data of a static is common for all objects
	 * 
	 * instance method:
	 * -------------------
	 * -> instance methods directly access instance and static data of
	 *    from the same class
	 * -> instance methods access instance data with help of an object
	 *    from other classes
	 *    
	 * 
	 * 
	 * 
	 * Object
	 * ----------
	 * 
	 * => Object is blue print of a class
	 * 
	 * Why to create an object and where to create object?
	 * ------------------------------------------------------
	 * -> to access non static/instance data from a static method of a same class.
	 * -> to access non static/instance data from static or non static methods
	 *    from a different class
	 *    
	 * 
	 * Notes
	 * -------
	 * -> instance method access instance and static data directly with out object from 
	 *    the same class
	 * -> instance method access instance data with help of object from different class
	 * -> static method access static data directly from the same class
	 * -> static method access static data with help of class name from the other class.
	 * -> static method never access instance data directly with out help of object from 
	 *    the same class or from other class
	 *    
	 * 
	 *    
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(">>>>> statement 2 -- main --");
		
		int x=10;
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.empId=1024;
		e2.empId=1025;
		e3.empId=1026;
		
		e1.empName="James";
		e2.empName="Ozvitha";
		e3.empName="Bucky Wall";
		
		
		
		e1.empId=10;
		
		//e3.companyName="Abc";
		
		System.out.println(e1.companyName);
		System.out.println(e2.companyName);
		System.out.println(e3.companyName);
		
		System.out.println("----------------------");
		//System.out.println(e1.empId);
		//System.out.println(e2.empId);
		//System.out.println(e3.empId);
		
		// v1
		//e1.display();
		//e2.display();
		//e3.display();
		
		Employee.f2();
		f2();
		
		
		// v2
		displayData(e1);
		displayData(e2);
		displayData(e3);
		
		
		
		
	}
	

}
