package com;

interface MyInter{
	void f1();
}
interface Test{
	void f2();
	//void f3();
}

interface MyInter1{
	void f3(int x);
}

@FunctionalInterface
interface MyInter2{
	void f4(int x,int y);
	//void f5();
}
// way 1
class C1 implements MyInter{
	@Override
	public void f1() {
	}
}


class C2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		f1();
		
	}
	
	void f1() {
		System.out.println(">>>> C2 class f1 method...");
	}
}

public class FunctionalInterfaceDemo {
	
	void f1() {
		for(int i=1;i<=5;i++) {
			System.out.println("f1 method by "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		FunctionalInterfaceDemo fd=new FunctionalInterfaceDemo();
		
		MyInter mi=new C1();
		mi.f1();
		
		// way - 2
		MyInter mi1=new MyInter() {
			
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		mi1.f1();
		
		// way 3: lambda expression
		
		//lambda expression
		//-----------------------
		// 1. lambda without parameters
		
		MyInter mi2=()->{ // note: lambda expression always returns interface
			System.out.println(">> hello f1");
		};
		
		Test t=()->{
		System.out.println(">>>>> logic of some xxxxxxx");	
		};
		
		t.f2();
		mi2.f1();
		
		// 2. lambda with parameters -v1
		
		//MyInter1 obj1= (int x)->{
			//System.out.println("X: "+x);
		//};
		
		// 3. lambda with parameters -v2
		
		MyInter1 obj1=(x)->{
			System.out.println("X: "+x);
		};
		
		//obj1.f3(10000);
		//obj1.f3(2300);
		
		// 3. lambda expression with two parameters
		//MyInter2 obj2=(n1,n2)->{
		//	System.out.println();
		//};
		
		// 4. lambda expression in case of a single statement
		
		MyInter2 obj2=(n1,n2)->System.out.println("X: "+n1+" and Y: "+n2);
		
		obj2.f4(100, 200);
		
		MyInter obj=()->System.out.println(">> hello f1 .....");
		
		obj.f1();
		
		Runnable r=()->{
			fd.f1();
		};
		
		
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
