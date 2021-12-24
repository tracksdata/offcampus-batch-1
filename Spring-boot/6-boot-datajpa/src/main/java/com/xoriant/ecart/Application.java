package com.xoriant.ecart;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoriant.ecart.dao.EmployeeDao;
import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.entity.Employee;
import com.xoriant.ecart.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
	
		ProductDao prodDao = ac.getBean(ProductDao.class);
		EmployeeDao empDao = ac.getBean(EmployeeDao.class);
		
		//prodDao.findAll().forEach(System.out::println);
		
		//Optional<Product> prod = prodDao.findById(11).or(null);
		//System.out.println(prod);
		
		//Employee emp = empDao.findById(1).get();
		//System.out.println(emp.getEmpId());
		//System.out.println(emp.getEmpName());
		
		//Employee e1=new Employee();
		//e1.setEmpId(6);
		//e1.setEmpName("Prashi");
		//empDao.save(e1);
		
		//Employee emp = empDao.findById(2).get();
		Employee e2 = empDao.findById(3).or(null).get();
		
		//empDao.delete(emp);
		//emp.setEmpName("Praveen");
		//empDao.save(emp);
		
		empDao.findAll().forEach(System.out::println);
		
		
	}

}
