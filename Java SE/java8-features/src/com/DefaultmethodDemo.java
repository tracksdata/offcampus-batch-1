package com;

@FunctionalInterface
interface Demo1{
	void f1(); // abstract
	//void f2(); // invalid
	//boolean equals(Object obj); // valid
	
	default void f2() {
		System.out.println(">>> impl 1");
	}
	
	default void f3() {
		System.out.println(">>> impl 2");
	}
	
}



public class DefaultmethodDemo {

	public static void main(String[] args) {
		
		Demo1 d1=()->{
			System.out.println(">>>>> f1 abstract method");
		};
		
		d1.f1();
		d1.f2();
		d1.f3();

	}

}
