package com;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			
			File fileLoc=new File("src/abc.txt");
			FileInputStream fis=null;

			if(fileLoc.exists()) {
				fis=new FileInputStream(fileLoc);
			}else {
				System.out.println("No File Found");
				return;
			}
			
			// Read data back from file
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fis.read());
			}
				
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
