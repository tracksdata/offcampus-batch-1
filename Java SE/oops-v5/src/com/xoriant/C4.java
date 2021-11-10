package com.xoriant;

public class C4 {
	
	public static void main(String[] args) {
		
		C3 c3=new C3();
		c3.f1(); // f1 is public 
		c3.f2(); // f2 is default
		c3.f3(); // f3 is protected
		//c3.f4(); // f4 is private
		
	}

}
