package com;

public class AddAny<E> {
	
	private Object[] data=new Object[10];
	private static  int index=0;
	private String elements="";
	
	public void add(E element) {
		data[index]=element;
		index++;
	}
	
	// find a element by index 
	
	public Object get(int index) {
		return data[index];
	}

	@Override
	public String toString() {
		for(int i=0;i<index;i++) {
			elements=elements+" "+data[i];
		}
		return elements;
		
	}
	
	public static void main(String[] args) {
		
		AddAny<Object> obj=new AddAny<>();
		
		obj.add("Abc");
		obj.add(1000);
		obj.add(445.54f);
		obj.add("Praveen");
		
		System.out.println(obj);
		
		for(int i=0;i<index;i++) {
			System.out.println(obj.get(i));
		}
		
		
		
	}
	
	
	

}
