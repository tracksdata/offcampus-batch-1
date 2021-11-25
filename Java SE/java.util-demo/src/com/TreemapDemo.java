package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		
		TreeMap<Object, Object> hm=new TreeMap<>();
		
		hm.put(1024, "Praveen");
		hm.put(1024, "James");
		hm.put(76, "Test");
		hm.put(2, "Test");
		hm.put(75, "Something");
		//hm.put(1026, null);
		
		
		System.out.println(hm.size());
		
		//System.out.println(hm.get("Abc"));
		
		System.out.println(hm);
		
		
		

	}

}
