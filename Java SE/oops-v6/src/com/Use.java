package com;

public class Use {

	public static void main(String[] args) {
		
		//Car car=new Car(); 
		
		Driver driver1=new Driver(1,"James","DR001",10);
		Driver driver2=new Driver(2,"Bucky","Dr002",13);
		
		Car car=new Car(driver2); 
		
		
		//car.setDriver(driver2);
		System.out.println(car);
		
		
		
		
	}

}
