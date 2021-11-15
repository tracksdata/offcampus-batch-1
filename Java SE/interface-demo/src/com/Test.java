package com;

public class Test {

	public static void main(String[] args) {
	
		Customer cust=new Bank();
		BankEmployee be=new Bank();
		Manager mgr=new Bank();
		SrManager sm=new Bank();
		
		
		cust.deposit(100);
		cust.withDraw(334);
		
		be.openAccount();
		be.closeAccount();
		
		mgr.netbanking();
		
		
		sm.openAccount();
		sm.deposit(333);
		
		
		
		
		
		
		
		
		
		

	}

}
