package com;

import java.lang.reflect.Method;

public class Use {

	public static void main(String[] args) {
		
		//String s1;

		Employee emp = new Employee();
		//Employee emp1=;
		Person p = new Person();
		 emp.f1();
		 p.f1();

		Object obj = new Employee();
		
		// System.out.println(obj.getClass());
		
		// java reflection API
		
		Class<?> clsObj=obj.getClass();
		System.out.println(clsObj.getName());
		System.out.println(clsObj.getPackageName());
		System.out.println(clsObj.getSuperclass().getName());
		Method[] methods = clsObj.getMethods();
		
		for(Method m:methods) {
			System.out.println(m.getName());
		}
		

		if (obj instanceof Employee) {
			Employee e1 = (Employee) obj;
			e1.f1();
		}
		if (obj instanceof Person) {
			Person p1 = (Person) obj;
			p1.f1();
		}

		

	}

}
