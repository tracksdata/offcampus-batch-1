package com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm=new HashMap<>();
		
		hm.put(1024, "Praveen");
		hm.put(1024, "James");
		hm.put("Abc", "Test");
		hm.put(1025, "Test");
		hm.put(null, "Something");
		hm.put(1026, null);
		
		
		System.out.println(hm.size());
		
		System.out.println(hm.get("Abc"));
		
		System.out.println(hm);
		
		
		

	}

}
