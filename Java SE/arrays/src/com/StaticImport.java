package com;

 import static java.lang.System.out; // JDK 6.0 
 import static java.lang.Math.sqrt;
 

public class StaticImport {
	void f1() {}
	
	public static void main(String[] args) {
		
		Object s=new StaticImport();
		StaticImport ss=(StaticImport)s;
		ss.f1();
		
		Object oa = new float[20]; 
		float[] temp=(float[])oa;
		
		temp[0]=100;
		System.out.println(temp[0]);
		
		
		System.out.println(oa.getClass().getTypeName());
		
		//System.out.println(oa);
		
		// x=(Float)oa;
		//System.out.println(x);
		
		
		//String s1=args[0];
		//System.out.println(s1);
		
//		out.println("hello");
//		Math.sqrt(100);
//		sqrt(44);
		
	}

}
