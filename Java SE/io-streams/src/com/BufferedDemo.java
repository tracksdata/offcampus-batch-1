package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedDemo {

	public static void main(String[] args) {
		
		try {
			
			//FileInputStream fis=new FileInputStream("src/abc.txt");
			
//			File fileLoc=new File("src/abc.txt");
//			
//			Scanner sc=new Scanner(fileLoc);
//			
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
			
			//isr.re
			System.out.println("Input a character: ");
			char ch= (char) br.read();
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
