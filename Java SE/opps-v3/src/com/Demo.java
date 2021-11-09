package com;

public class Demo {
	
	/*
	 * 
	 * methods
	 * ----------
	 * -> method is a special block in java which can be called 
	 *    n number of times.
	 * -> larger code should be divided into small marks,
	 *    and each part is called a method.
	 *    
	 *   Types of methods
	 *   ---------------------
	 *   1. method with out parameters / argumemts and without 
	 *      return type. (no communication) 
	 *   2. method with parameter and with out return type ( 1 way communication)
	 *   3. method without parameter and with return type ( 1 way communication)
	 *   4. method with parameter and with return type. (2 way communication)
	 * 
	 *   basics 
	 *   ===============================
	 *   1. arguments: two types
	 *   -------------------------
	 *    1. actual arguments
	 *    2. formal arguments
	 *    
	 *   2. method types : 2 types 
	 *   ---------------------------
	 *    1. method defination/body of method / called method
	 *    2. method declaration / calling method / prototype of method
	 *   
	 *   3. return type
	 *   -----------------
	 *   => every method in java must be return a value.
	 *   => if any method returns nothing, then return type must be 'void'
	 *   => method must return one value at a time.
	 * 
	 */
	
	
	   
	
	   double salary=10000;
	
	
      // type 1 method	: no arguments and return type
 	  void  sum() { // called method
		  System.out.println("2. sum");  
	  }
	  
 	  // type 2 method: no return type, but with argument
	  void fun(int i) {
		  if(i==6) {
			  return; // method termination
		  }
		  System.out.println(i);
		  i++;
		  fun(i);  
	  }
	  
	  // type 3 method: no argument, but with return type
	  double calculateSalary() {
		  salary=salary+5000;
		  return salary;
	  }
	  
	  // type 4: with arguments and with return type
	  
	  double square(double num) {
		  return num*num;
	  }
	  
	public static void main(String[] args) {
		
	   Demo d=new Demo();
	   System.out.println("1. main");
	   System.out.println("-------------------------");
	  
	   for(int i=1;i<=5;i++) {
		   System.out.println(i);
	   }
	   System.out.println("-------------------------");
	   
	   d.fun(1);
	   
	   System.out.println(d.salary);
	   System.out.println(d.calculateSalary());
	   
	   System.out.println(d.square(10));

	  // d.sum(); //  calling method
	  // d.sum();
	   System.out.println("3. after function call");
	   

	}

}
