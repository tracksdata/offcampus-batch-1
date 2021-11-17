package com;

import java.util.Scanner;

public class UseDefinedException {

	public static void main(String[] args) {

		String[] cities = { "Hyd", "Chennai", "Pune", "Kolkata" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a city to Search: ");
		String cityName = sc.next();

		boolean flag = false;

		for (String city : cities) {
			if (city.equals(cityName)) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println(cityName + " found in array");
		} else {
			
				throw new CityNotFoundException(cityName + " not found in given array");

		}

	}

}
