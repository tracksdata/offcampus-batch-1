package com;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			File fileLoc=new File("src/xyzxx.txt");
			FileReader fr=null;
			
			if(fileLoc.exists()) {
				fr=new FileReader(fileLoc);
			}else {
				System.out.println(">>>> File Not Found <<<<");
				return;
			}
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fr.read());
			}
			
			fr.close();
			
			
		} catch (Exception e) {
			System.out.println(">>>> Catch <<<<");
			e.printStackTrace();
		}

	}

}
