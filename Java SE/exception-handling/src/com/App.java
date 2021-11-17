package com;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		boolean check = true;

		while (check) {

			Scanner sc = new Scanner(System.in);

			try {

				System.out.println("Enter a Number: ");
				int num = sc.nextInt();
				System.out.println("Number is " + num);
				check = false;

			} catch (Exception e) {
				System.out.println("Wrong input: Enter only numbers: ");
			}
		} // end of while

		System.out.println("hello...");

	}

}
