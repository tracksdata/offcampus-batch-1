package com;

//import com.xoriant.*; // not recammended
import com.xoriant.C3;
import com.xoriant.C4;
import com.xoriant.ecart.C5;
import com.xoriant.ecart.C6;
import com.xoriant.ecart.model.C7;
import com.xoriant.ecart.model.C8;






public class C1 extends C3{

	public static void main(String[] args) {
		
		C1 c1=new C1();
		
		C2 c2=new C2();
		
		C3 c3=new C3();
		
		c3.f1(); // public
		//c3.f2(); //  default
		//c3.f3(); // protected
		//c3.f4(); // private
		c1.f3();
		c1.f1();
		//c1.f2();
		//c1.f4();
		
		
		
		C4 c4=new C4();
		
		C5 c5=new C5();
		C6 c6=new C6();
		
		C7 c7=new C7();
		C8 c8=new C8(); 
		
		
		
		
		
	}
}
