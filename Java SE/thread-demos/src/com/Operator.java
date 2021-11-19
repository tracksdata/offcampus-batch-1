package com;

class Reservation implements Runnable {

	int availableSeats = 1;
	int wantedSeats;

	public Reservation(int wantedSeats) {
		this.wantedSeats = wantedSeats;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public  void bookTicket() {
		String tname = Thread.currentThread().getName();
		
		System.out.println("Showing availability for " + tname + " " + availableSeats + " avaialable");
		System.out.println("--------------------------------------------------------");
		synchronized(this) {
		if (wantedSeats <= availableSeats) {
			System.out.println("Trying to book " + wantedSeats + " for " + tname);
			try {
				Thread.sleep(5000); // bankers confirmation
				availableSeats=availableSeats-wantedSeats;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(wantedSeats+" booked for "+tname);
			System.out.println("Available Seats : "+availableSeats);
			System.out.println("-----------------------------------------------");

		} else {
			System.out.println("No seats avaialble : Avaiable Seats are: "+availableSeats);
		}
		}
		
		// ---------
		synchronized ("passenger2") {
			// ---
		}
		
		//---------
		synchronized (this) {
			// ---
		}

	}

}

public class Operator {

	public static void main(String[] args) {

		Reservation r = new Reservation(1);

		Thread passenger1 = new Thread(r, "passenger1"); // new 
		Thread passenger2 = new Thread(r, "passenger2"); // new

		passenger1.start(); // runnable 
		passenger2.start(); // runnable

	}

}
