package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Object> hs = new LinkedHashSet<Object>();
		
		hs.add("Abc");
		hs.add(9749747);
		hs.add(3746.43f);
		hs.add(834634.544);
		hs.add('A');
		hs.add("Abc");
		hs.add(false);

		System.out.println(hs);
		
		List<Object> data=new ArrayList<Object>();
		data.addAll(hs);
		
		System.out.println(data);
		
		
		
		
		

	}

}
