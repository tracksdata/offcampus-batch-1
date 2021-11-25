package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemoV1 {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm=new HashMap<>();
		
		hm.put(1024, "Praveen");
		hm.put(1024, "James");
		hm.put(76, "Test");
		hm.put(2, "Test");
		hm.put(75, "Something");
		//hm.put(1026, null);
		
		
		System.out.println(hm.size());
		
		//System.out.println(hm.get("Abc"));
		
		System.out.println(hm);
		
		// convert keys of map into set interface..
		
		Set<Object> keys = hm.keySet();
		
		System.out.println(keys);
		
		System.out.println("-----------------------------");
		
		Iterator<Object> it=keys.iterator();
		
		while(it.hasNext()) {
			Object key=it.next();
			System.out.println(hm.get(key));
		}
		
		System.out.println("===========================");
		
		Set<Entry<Object, Object>> data = hm.entrySet();
		
		System.out.println(data);
		System.out.println("--------------------------");
		for(Object obj:data) {
			System.out.println(obj);
		}
		
		
		
		
		

	}

}
