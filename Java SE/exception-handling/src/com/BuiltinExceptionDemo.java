package com;

public class BuiltinExceptionDemo {

	public static void main(String[] args) {

		try {
			int i[] = new int[1];
			int x = 10 / 2;
			System.out.println(x);
			i[0] = 98;
			// Class.forName("com.Test");

		} catch (ArithmeticException ae) {
			System.out.println("Failed due to " + ae);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("failed due to " + aie);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Always");
		}
		
		//----------------

	}

}
