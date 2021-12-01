package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterDemo {

	public static void main(String[] args) {
		
		
		LocalDate date=LocalDate.of(2021, 8, 23);
		
		System.out.println(date);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");


		
		
		System.out.println(formatter.format(date));
		System.out.println(formatter1.format(date));
		System.out.println(formatter2.format(date));


		
	}

}
