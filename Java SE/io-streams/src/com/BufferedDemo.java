package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedDemo {

	public static void main(String[] args) {
		
		try {
			
			//FileInputStream fis=new FileInputStream("src/abc.txt");
			
//			File fileLoc=new File("src/abc.txt");
//			
//			
			Scanner sc=new Scanner(System.in);
			boolean boValue = sc.nextBoolean();
			String s2=sc.next();
			char ch1 = s2.charAt(0);
			
			
//			//int n1 = sc.nextInt();
//			//System.out.println(n1);
//			
//			while(sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//			
//			System.out.println(">>>> done <<<<");
			
			
			//InputStreamReader isr=;
			//  character stream
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			File fileLoc=new File("src/abc.txt");
			
			//FileInputStream fis=new FileInputStream(fileLoc);
			
			BufferedReader br1=new BufferedReader(new FileReader(fileLoc));
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)br1.read());
			}
			
			
			//isr.re
			System.out.println("Input a number: ");
			//char ch= (char) br.read();
			int ch=Integer.parseInt(br.readLine());
			System.out.println(ch);
			br.read();
			System.out.println("Enter a Strig: ");
			String s1=br.readLine();
			System.out.println(s1);
			
			System.out.println("Enter a nunber: ");
			
			int x=Integer.parseInt(br.readLine());
			
			System.out.println(x);
			
		
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
