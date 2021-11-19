package com;

public class Demo implements Runnable {

	@Override
	public void run() {
		f1();
	}

	 void f1() {
		String tname = Thread.currentThread().getName();

		System.out.println("hey i am f1 method - " + tname);

		synchronized(this) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("I = " + i + " by " + tname);
		}
		} // end of synchronized block
	}

	public static void main(String[] args) {

		String tname = Thread.currentThread().getName();
		System.out.println(">>>> main method by " + tname + " <<<<");

		Demo d = new Demo();
		// d.f1();
		// d.run();

		Thread t1 = new Thread(d);
		t1.setName("First");
		// t1.setPriority(Thread.MAX_PRIORITY); // 10

		Thread t2 = new Thread(d, "Second");

		t1.start();
		t2.start();

		// System.out.println(">>>> main method <<<<");
		// System.out.println(Thread.currentThread().getName());

	}

}
