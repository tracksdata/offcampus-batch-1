package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
	
	B b; // 'has A'

	private static final long serialVersionUID = 1L;
	int id = 10;
	int pid;
	double dd;
}

public class B extends A { // 'is A'
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age = 33;
	int bid;
	float ff;

	public static void main(String[] args) {

		B b = new B();
		try {

			FileOutputStream fos = new FileOutputStream("src/aaa.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b);
			oos.close();
			System.out.println(">>>> Done <<<");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
