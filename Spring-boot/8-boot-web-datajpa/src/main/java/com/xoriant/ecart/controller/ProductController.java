package com.xoriant.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xoriant.ecart.dao.EmployeeDao;
import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.entity.Employee;
import com.xoriant.ecart.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping("/s1")
	public String f1(Model model) {
		System.out.println(">>>ProductController f1 method ");
		String name="Praveen";
		model.addAttribute("user", name);
		return "sample";
	}
	
	@RequestMapping("/employees")
	public String findAll(Model model){
		List<Employee> employees = empDao.findAll();
		model.addAttribute("emps", employees);
		return "employees";
		
	}

}
