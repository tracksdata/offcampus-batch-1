package com;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable<Object, Object> hm=new Hashtable<>();
		
		hm.put(1024, "Praveen");
		hm.put(1024, "James");
		hm.put("Abc", "Test");
		hm.put(1025, "Test");
		//hm.put(null, "Something");
		//hm.put(1026, null);
		
		
		System.out.println(hm.size());
		
		System.out.println(hm.get("Abc"));
		
		System.out.println(hm);
		
		
		

	}

}
