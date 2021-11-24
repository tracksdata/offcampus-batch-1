package com;

public class TestV1<T> {
	
	
	  public void display(T x) {
		  System.out.println(x.getClass().getTypeName());
		  System.out.println("Value: "+x);
	  }
	  
	  
	
	

	public static void main(String[] args) {
		
		TestV1<Object> t=new TestV1<>();
		t.display(100);
		t.display(45.54f);
		t.display(76.45);
		t.display(765L);
		t.display("Abc");
		t.display('H');
		//t.display(new Object());
		
		
	
	}

}
