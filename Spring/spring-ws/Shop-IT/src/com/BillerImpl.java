package com;

// dependent
public class BillerImpl {
	
	/*
	 * Design Issues
	 * -------------------
	 * 
	 * -> too many dependency object creations
	 * 		-> perfomence application goes down
	 * 		-> memory management issues
	 * 
	 *   why this issue happened?
	 *   --------------------------------
	 *   -> dependent class itself creating dependency class object.
	 *   
	 *   what is the solution?
	 *   ------------------------
	 *   -> do not create dependency object in the dependent class
	 *   -> instead, try to use look up techniques like JNDI etc..
	 *   	-> JNDO location is tightly coupled with dependent class.
	 *   
	 *   What is the best solution?
	 *   ------------------------------
	 *   -> do not find or create. instead ask some one (container) to inject(pass) dependency : IoC (Inversion of control)
	 *  
	 *   How to implement IoC?
	 *   -------------------------
	 *   -> using dependency injection technique.
	 *   
	 *   What is Dependency injection (DI)?
	 *   --------------------------------
	 *   -> Injecting / passing dependency object to the dependent object : DI
	 * 
	 * 
	 *   In how many ways DI can be implemented? : 2 ways
	 *   --------------------------------------------------
	 *   1. setter based injection
	 *   2. constructor based injection
	 *   
	 *   1. setter based injection
	 *   ------------------------------
	 *   	-> create reference variable for a dependency in the dependent class at class level
	 *   	-> create setter method for above defined reference variable.
	 *   
	 * 
	 */
	
	
	private PriceMatrixImpl price; // Dependency class reference variable
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}

	public double getCartTotal(String[] cart) {
		
		//PriceMatrixImpl price=new PriceMatrixImpl();// dependency object
		
		double total=0.0;
		for(String itemCode:cart) {
			total=total+price.getItemPrice(itemCode);
		}
		return total;
	}

}
