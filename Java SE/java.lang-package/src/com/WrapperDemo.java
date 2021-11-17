package com;

public class WrapperDemo {
	
	/*
	 * 
	 *   Wrapper classes
	 *   ======================
	 *   primitive 		Wrapper type
	 *   -------------------------------
	 *   int			Integer
	 *   short			Short
	 *   byte			Byte
	 *   long			Long
	 *   float			Float
	 *   double			Double
	 *   char			Character
	 *   boolean		Boolean
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int x=100; // new Integer(100)
		float f=x; // auto
		double dd=x; // auto
		short s=877;
		long l=x; // auto
		int ss=s; // auto
		byte b=(byte)x; // casting is required
		float ff=987.43f;
		//int xx=ff;
		
		String sss="1000";
		
		//int n=(int)sss;
		int n = Integer.parseInt(sss);
		int nn=9988;
		String str=nn+"";
		
		//String str=new Integer(97973).toString();
		  
		
		Float fff=new Float(233.76);
		int i = fff.intValue();
		System.out.println(i);
		
		Integer ii=new Integer(130);
		
		byte bb = ii.byteValue();
		
		System.out.println(bb);
		
		String bs = Integer.toBinaryString(76643);
		System.out.println(bs);
		
		int num = Integer.parseInt("1000");
		System.out.println(num);
		
		Float.parseFloat("877.54");
		
		int intNo=988;
		
		Integer intObj=new Integer(intNo);
		
		
		
		
		
		
		

	}

}
