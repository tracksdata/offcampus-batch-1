package com;

public class Test {

	  final static int MAX_AGE=98;
	  
	  void f1() {
		  final int MAX_NUM=888;
		  System.out.println(MAX_NUM);
	  }
	  
	public static void main(String[] args) {
		
		
	  
	    Test t=new Test();
	    t.f1();
	
		System.out.println(MAX_AGE);
		
	}

}
