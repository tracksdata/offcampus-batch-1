package com;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			
			File fileLoc=new File("src/xyz.txt");
			
			
			
			FileWriter fw=new FileWriter(fileLoc,true);
			
			String s1="\nNew Line";
			
			fw.write(s1);
			System.out.println(">>> Done <<<");
			
			fw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
