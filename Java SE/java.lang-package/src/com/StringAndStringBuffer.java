package com;

public class StringAndStringBuffer {
	
	public static void main(String[] args) {
		
		String s1="Abc"; // immutable
		System.out.println("S1: "+s1);
		System.out.println("S1 Hashcode: "+s1.hashCode());
		
		String s2=new String("Abc");
		
		System.out.println("S2: "+s2);
		System.out.println("S2 Hashcode: "+s2.hashCode());
		
		System.out.println("======================");
		System.out.println("S1: "+System.identityHashCode(s1));
		System.out.println("S2: "+System.identityHashCode(s2));
		
		if(s1.equals(s2)) { // == always compares hash code
			// equals method always compares the content of objects
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
		
		
		
		
	}

}
