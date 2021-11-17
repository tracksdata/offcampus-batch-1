package com;

import java.io.FileInputStream;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception {

	
			Class<?> cl = Class.forName("com.App");
			FileInputStream fis=new FileInputStream("");

			System.out.println(cl);
			
		
	}

}
