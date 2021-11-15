package com;

class A {
	public void f1() {
		System.out.println("A f1");
	}
	
	void f2() {}
	protected void f3() {}
	
	int f4(int x) {return 0;}
}
public class B extends A {
	
	public int f4() {
		return 0;
	}
	@Override
	public int f4(int x) {return 0;}  // overridden
	public int f4(long x) {return 0;} // individual
	
	@Override
	public void f3() {}
	
	@Override
	public void f1() {
		System.out.println("B f1");
	}
	
	@Override
	protected void f2() {}
	

	public static void main(String[] args) {
      // A a=new B();
       //a.f1();
	}

}
