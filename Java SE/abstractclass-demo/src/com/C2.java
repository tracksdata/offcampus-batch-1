package com;

 class C1{
	 
	 final void f1() {
		 System.out.println(">> f1");
	 }
	 private void f3() {
		 System.out.println(">>> f3");
	 }
	 void f2() {}
 }

public class C2 extends C1{
	
    //void f1() {}
	
	
	public static void main(String[] args) {
		
		C2 c2=new C2();
		c2.f1();
		
		
		
	}

}
