package com;

public class TestV3<T> {
	
	
	  public void display(T x) {
		  System.out.println(x.getClass().getTypeName());
		  System.out.println("Value: "+x);
		  if(x instanceof Employee) {
			  ((Employee) x).processSalary();
		  }
		  
		  if(x instanceof Person) {
			  ((Person) x).processSalary();
		  }
	  }
	  
	  
	
	

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new SalariedEmployee();
		Employee e3=new ContractEmployee();
		
		Direct d=new Direct();
		Vendor v=new Vendor();
		
		Person p=new Person();
		
		TestV3<Employee> t=new TestV3<>();
		
		//t.display(100);
		t.display(e1);
		t.display(e2);
		t.display(e3);
		//t.display(p);
		t.display(d);
		t.display(v);
		
		
		
	
		
	
	}

}
