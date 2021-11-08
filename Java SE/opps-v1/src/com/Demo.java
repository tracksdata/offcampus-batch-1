package com;

class Test{
	void f3() {
		f2();
	}
	public void f2() {
		System.out.println(">> f2 method of Test class");
	}
}

public class Demo {
	
	
	void f1(int x) { // method
		
	}
	
	void f1(long l) {
		
	}
	
	void f1(float x) {}
	void f1(double x) {}

	public static void main(String[] args) {
		Demo d=new Demo();
		//d.f1(1000.75);
		
		// How many butes? 4 ? -> 32
		// How many bits long ->  64
		
		int i=2147483647;
		long x=2147483648L;
		//9223372036854775807
		
		//System.out.println(i);
		//System.out.println(x);
		int y=07754555;
		System.out.println(y);
		
		
		
		
	}

}
