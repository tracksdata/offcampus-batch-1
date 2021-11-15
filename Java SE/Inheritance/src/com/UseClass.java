package com;

public class UseClass {

	public static void main(String[] args) {
		
		/*
		ContractEmployee ce=new ContractEmployee(200,5000);
		RegularEmployee re=new RegularEmployee(22,4500);
		
		ce.addEmployee(10, "Praveen");
		ce.processSalary();
		
		re.addEmployee(11, "Ozvitha");
		re.processSalary();
		*/
		
		Employee emp=new ContractEmployee(200, 5000);
		emp.addEmployee(10, "Praveen");
		emp.processSalary();
		System.out.println(emp);
		
		emp=new RegularEmployee(18,5600);
		emp.addEmployee(11, "James");
		emp.processSalary();
		System.out.println(emp);
		
	
		
		
		
		
		
		
		
		

	}

}
