package com;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
	  Stack<Object> ar=new Stack<>();
	  
	  ar.add(76.34f);
	  ar.add("Abc");
	  ar.add(100);
	  ar.add(3847.43);
	  ar.add('A');
	  ar.add(false);
	  ar.add(100);
	  ar.add("Tamilnadu");
	  ar.add("Abc");
	  ar.add("test");
	  ar.add(new Object());
	  ar.add(394739);
	  ar.add(1,"New data");
	  ar.add("Hello");
	  
	
	  
	  System.out.println(ar);
	  System.out.println(ar.size());
	  
	  
	  
	  // find element using index...
	  
	  Object data = ar.get(1);
	  System.out.println(data);
	  ar.remove(4);
	  System.out.println(ar);
	  
	 //---------------------------
	  
	  // list iterations : 5 ways
	  
	  // way 1 : usoing for loop
	  System.out.println("-----------------");
	  for(int i=0;i<ar.size();i++) {
		  System.out.println(ar.get(i));
		 // ar.add(112);
		 // ar.add(2,877);
		 // ar.remove(4);
	  }
	  System.out.println("-----------------");
	  
	  // using for each loop . 5.0 and above .. only for arrays
	  
	  for(Object obj:ar) {
		  System.out.println(obj);
		  //ar.add(343434);
	  }
	  
	  // way 3: Iterator interface
	  
	  System.out.println("=================");
	  
	  Iterator<Object> it=ar.iterator();
	  while(it.hasNext()) {
		  Object obj=it.next();
		  System.out.println(obj);
		  if(obj.equals("test")) {
			 // System.out.println("-----test...");
			  it.remove(); //
		  }
		  
		 
		  //ar.remove(2);
		  
	  }
	  
	  System.out.println("================");
	  System.out.println(ar);
	  
	
	  
	  // way -4 : ListIterator interface : only for List implementation class
	  System.out.println(">>>>>>>> === <<<<<<");
	  ListIterator<Object> li=ar.listIterator();
	
	
	  
	  while(li.hasNext()) {
		  
		  Object obj=li.next();
		  
		  System.out.println(obj);
		 
		  if(obj.equals("Tamilnadu")) {
			 
			  li.add("Chennai");
		  }
		  
		  if(obj.equals(394739)) {
			  li.set(50000);
		  }
		  
		  if(obj.equals("Abc")) {
			  li.remove();
		  }
		  
	  }

	  
	  System.out.println("-------------------------");
	  System.out.println(ar);
	  
	  
	  System.out.println("=========<<<  >>>==========");
	  // data in reverse
	  while(li.hasPrevious()) {
	
		  System.out.println(li.previous());
	  }
	  System.out.println("=========<<<  >>>==========");
		
	
	  /*
	 // way 5 - Enumeration interface : only for synchrized methods
	  
	  System.out.println(">>>>>>>>>>> +++++++ <<<<<<<<<<<");
	  Enumeration<Object> itr=ar.elements();
	  
	  while(itr.hasMoreElements()) {
		  System.out.println(itr.nextElement());
	  }
	  
	  System.out.println(">>>>>>>>>>> +++++++ <<<<<<<<<<<");
  */
	  
		
		

	}

}
