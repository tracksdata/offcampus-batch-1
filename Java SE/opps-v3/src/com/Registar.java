package com;

// singleton  design pattern implementation
public class Registar {
	
	static Registar reg;
	
	private Registar() {} // default constructor
	
	static Registar getRegistar() {
		
		if(reg==null) {
			reg=new Registar();
		}
		return reg;
	}

}
