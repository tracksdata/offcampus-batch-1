package com;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			
			
			FileOutputStream fos=new FileOutputStream("src/abc.txt",true);
			
			String s1="\n .. oh really!";
			
			//fos.write(s1);
			// convert string into char array
			/*
			char[] data = s1.toCharArray();
			for(int i=0;i<data.length;i++) {
				//System.out.print((int)data[i]);
				fos.write((int)data[i]);
			}
			*/
			
			// convert string into byte array
			byte[] data = s1.getBytes();
			fos.write(data);
			
			System.out.println();
			
			fos.close();
			
			System.out.println(">>> done <<<");
			
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}

	}

}
