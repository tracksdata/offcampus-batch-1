package com.xoriant.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xoriant.ecart.entity.Product;

@Controller
public class ProductController {
	/*
	 * 
	 * HTTP Status codes
	 * --------------------------------------------
	 *  1x : 100 to 199 -> information
	 *  2x : 200 to 299 -> success
	 *  3x : 300 to 399 -> redirections
	 *  4x : 400 to 499 -> client side error
	 *  5x : 500 to 599 -> server side error 
	 * --------------------------------------------
	 * 
	 * 
	 */
	
	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println(">>> ProductController f1 method");
	}
	

	@RequestMapping(value = "/abc")
	public void f2() {
		
		System.out.println(">>> ProductController f2 method");
	}
	
	@RequestMapping(value = "/hello")
	public String f3() {
		return "test";
		
	}
	
	
	@RequestMapping(value = "/greet")
	public String f4(Model model) {
		String name="Praveen";
		model.addAttribute("personName", name);
		model.addAttribute("city", "Hyderabad");
		return "sample";
	}
	
	@RequestMapping("/s2")
	public ModelAndView f5() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("personName", "Ozvitha  Fernz");
		mav.addObject("city", "Goa");
		
		mav.setViewName("sample");
		
		return mav;
		
	}
	
	@RequestMapping("/s3")
	public String f6(ModelMap mm) {
		
		mm.addAttribute("personName", "Kavitha");
		mm.addAttribute("city", "Pune");
		
		return "sample";
		
		
	}
	
	
	@RequestMapping("/saveProduct")
	public String saveProduct(@RequestParam("id") int id,
			@RequestParam("name")String name,
			@RequestParam("price")double price,
			@RequestParam("description")String description
			) {
		System.out.println(">>> PID:: "+id);
		System.out.println( name);
		System.out.println(price);
		System.out.println(description);
		
		return "success";
	}
	
	@RequestMapping("/saveProductV1")
	public String saveProductV1(@ModelAttribute Product prod) {
		
		System.out.println(prod);
		
		return "success";
	}
	
	
	@RequestMapping(value = "/loadProductForm")
	public String loadProdForm() {
		return "product-form";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
