package com;

public class TestV2<T extends ContractEmployee> {
	
	
	  public void display(T x) {
		  System.out.println(x.getClass().getTypeName());
		  System.out.println("Value: "+x);
		  if(x instanceof Employee) {
			  ((Employee) x).processSalary();
		  }
		  
		
	  }
	  
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new SalariedEmployee();
		Employee e3=new ContractEmployee();


		ContractEmployee e3v1=new ContractEmployee();
		
		Direct d=new Direct();
		Vendor v=new Vendor();
		
		Person p=new Person();
		
		TestV2<ContractEmployee> t=new TestV2<>();
		
		//t.display(100);
		//t.display(e1);
		//t.display(e2);
		//t.display(e3);
		//t.display(p);
		t.display(e3v1);
		t.display(d);
		t.display(v);
		
		
		
	
		
	
	}

}
