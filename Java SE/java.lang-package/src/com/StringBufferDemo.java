package com;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc");
		System.out.println("Sb: "+sb);
		System.out.println("Sb hashcode: "+System.identityHashCode(sb));
		
		sb.append(" Xyz");
		
		System.out.println("Sb: "+sb);
		System.out.println("Sb hashcode: "+System.identityHashCode(sb));
		
		sb.reverse();
		
		System.out.println("Sb: "+sb);
		System.out.println("Sb hashcode: "+System.identityHashCode(sb));
		
		
		String s1="Abc";
		String s2 = s1.concat(" Xyz");
		
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
		
		StringBuilder sbb=new StringBuilder("Abc");
		
		

	}

}
