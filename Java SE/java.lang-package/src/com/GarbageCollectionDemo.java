package com;

class Customer{
	
	private static int count=1;
	private int custId;
	private String custName;
	private int age;
	private String address;
	private String emailId;
	
	public void f1() {}
	public void f2() {}
	public void f3() {}
	public void f4() {}
	public void f5() {}	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collector invoked "+count+++" times");
	}
}

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		//System.out.println(rt.availableProcessors());
		System.out.println(rt.totalMemory());
		
		
		for(int i=1;i<=931300;i++) {
			Customer cut=new Customer();
		}
		
		//System.gc();
		
		System.out.println(rt.totalMemory()-rt.freeMemory());
		System.out.println(rt.freeMemory());

		
		System.out.println("------------------------------------");
		
		
		

	}

}
