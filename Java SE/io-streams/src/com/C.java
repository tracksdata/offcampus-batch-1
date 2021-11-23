package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class C {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis=new FileInputStream("src/aaa.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			B b=(B)ois.readObject();
			System.out.println(b.id);
			System.out.println(b.age);
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
