package com;

abstract class C4{
	void f1() {}
    abstract void f2();
    abstract void f3();

}

abstract class C5 extends C4{

	@Override
	void f2() {
		// TODO Auto-generated method stub
		
	}

}
class C6 extends C5{

	@Override
	void f3() {
		// TODO Auto-generated method stub
		
	}
	
}

public  class Demo {
	
	public static void main(String[] args) {
		
	}
}
