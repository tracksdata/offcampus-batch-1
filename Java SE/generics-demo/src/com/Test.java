package com;

public class Test {
	
	public void display(int x) {
		System.out.println("integer: "+x);
	}
	

	public void display(float x) {
		System.out.println("float: "+x);
	}
	

	public void display(double x) {
		System.out.println("double: "+x);
	}
	

	public void display(long x) {
		System.out.println("Long: "+x);
	}
	

	public void display(String x) {
		System.out.println("String: "+x);
	}
	
	

	public static void main(String[] args) {
		
		Test t=new Test();
		t.display("Abc");

	}

}
