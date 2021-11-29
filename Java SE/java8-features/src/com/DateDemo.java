package com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate dob = LocalDate.of(1987, 12, 21);
		System.out.println(dob);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		

	}

}
