package com;

import java.io.PrintStream;

// method overloading

public class Demo {
	
	
	
	/* method overloading
	 * =====================
	 * -> same method name with different signature
	 * 
	 *  what is signature?
	 *  -------------------
	 *   -> name of method
	 *   -> number of arguments
	 *   -> type of arguments
	 *   -> position of arguments
	 */
	
	
	 void f1() {
		  System.out.println("Default");
	  }
	 
	 
	   void f1(int x) {
	  System.out.println("int: "+x);
	  }
	   
	  
	   
	   void f1(short x) {
			  System.out.println("short x: "+x);
		  }
	   
	   void f1(byte x) {
			  System.out.println("byte x: "+x);
		  }
	  
	  void f1(float x) {
		  System.out.println("float x: "+x);
	  }
	  
	  void f1(double x) {
		  System.out.println("double x: "+x);
	  }
	  
	  void f1(char x) {
		  System.out.println("char x: "+x);
	  }
	  
	  
	  void f1(int x,int y) {
		  System.out.println("int ...");
	  }
	  void f1(long y,long  x) {
		  System.out.println("long ...");
	  }
	  
	  void f1(int x,float y) {
		  System.out.println("int x: "+x+" and float y: "+y);
	  }
	  
	 
	 
	public static void main(String[] args) {
		
		Demo d=new Demo();
		
		d.f1((char)97);
		//System.out.println(Long.MAX_VALUE);
		
		//d.f1(100,200);
		long ll=9223372036854775807L;

		
		//d.f1(9223372036854775807L);
		
		//long x=100;
		
		//d.f1(87); // ?
		
		//d.f1((byte)8); // ?
		
		//float f=76.45F;
		
		//d.f1(f); // ?
		
		
		/*
		d.f1();
		d.f1(12);
		d.f1(23.54f);
		d.f1(100,200.76f);
		d.f1(344.34f,553);
		*/
		
		

	}

}
