package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			
			IOException i=new IOException("test");
			
			File file=new File("src/d1/d2/d3/d4");
			//file.mkdir();
			file.mkdirs();
			
			File file1=new File(file+"/test1.txt");
			file1.createNewFile();
			//file1.setReadOnly();
			file.createNewFile();
			System.out.println(file1.canWrite());
			
			
			FileWriter fw=new FileWriter(file1);
			fw.write("testing new ...");
			fw.close();
			
			System.out.println(">>> Done <<<");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
