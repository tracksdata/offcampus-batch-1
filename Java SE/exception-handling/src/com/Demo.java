package com;

import java.io.File;
import java.io.FileInputStream;

public class Demo {

	/*
	 * Exception Handling --------------------- two types -------------- 1. checked
	 * exceptions (compile time) 2. unchecked exceptions (run time)
	 * 
	 * 
	 * types -------- 1. Built in exceptions 2. UserDefined exceptions
	 * 
	 * 
	 * checked user defined ------------------------------------------------- any
	 * sub class of Exception any sub class of RuntimeException
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws Exception {

		// Class.forName("com.Employee");

		// Thread.sleep(1000);

		try {

			File file=new File("src/abc.txt");
			FileInputStream fis = new FileInputStream(file);
			
			for(int i=0;i<file.length();i++) {
				System.out.print((char)fis.read());
			}
			
			System.out.println();
			
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("failed due to "+e);
		}finally {

			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
		}

	

	}

}
