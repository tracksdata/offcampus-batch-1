package com;

public class GarbagewCollectionDemov2 {
	public static void main(String[] args) {
		String s1="Abc"; // 65602
		String s2=s1; // 65602
		s1=null;
		System.out.println(s2.hashCode());
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
		
		
		
	}

}
