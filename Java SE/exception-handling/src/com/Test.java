package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a no: ");
		int x = sc.nextInt();
		System.out.println("No is " + x);
		sc.nextLine();
		System.out.println("Input a String: ");
		String s1 = sc.nextLine();
		System.out.println("s1: " + s1);

	}

}
