package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {

		try {

			Employee e1 = new Employee(10, "Praveen", 150000,"Some Thing");

			FileOutputStream fos = new FileOutputStream("src/data.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(e1);

			System.out.println(">>> Done <<<");
			System.out.println(e1.getInfo());
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
