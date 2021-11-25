package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (int) (e1.getSalary() - e2.getSalary());
	}
}

class SortByName implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmpName().compareTo(e2.getEmpName());
	}
}

public class ComplexDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(65, "Csd", 67000);
		Employee e2 = new Employee(78, "Khs", 76000);
		Employee e3 = new Employee(12, "Akj", 10000);
		Employee e4 = new Employee(11, "Zjh", 18000);
		Employee e5 = new Employee(56, "Bfd", 32000);
		Employee e6 = new Employee(21, "Dgf", 19000);

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);

		// List<Employee> empsV1 = Arrays.asList(e1,e2,e3,e4,e5);
		// empsV1.add(e6);

		System.out.println("Original Data");
		Employee.display(emps);

		System.out.println("Sort by Employee ID");
		Collections.sort(emps);
		Employee.display(emps);

		System.out.println("Sort By Name: ");
		Collections.sort(emps,new SortByName());
		Employee.display(emps);

		System.out.println("Sort By Salary");
		Collections.sort(emps, new SortBySalary());
		Employee.display(emps);

	}

}
