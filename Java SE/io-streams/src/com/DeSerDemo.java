package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("src/data.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Employee emp = (Employee) ois.readObject();

			System.out.println(emp);
			System.out.println(emp.getInfo());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
