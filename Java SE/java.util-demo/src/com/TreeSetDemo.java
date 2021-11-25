package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<Object>();
		
		ts.add("Abc");
		ts.add("Xyz");
		ts.add("Kyd");
		ts.add("Bsc");
		ts.add("Cmd");
		ts.add("Xyz");
		
		System.out.println(ts.size());

		System.out.println(ts);

	}

}
