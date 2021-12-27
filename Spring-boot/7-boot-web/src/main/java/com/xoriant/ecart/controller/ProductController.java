package com.xoriant.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/s1")
	public String f1(Model model) {
		System.out.println(">>>ProductController f1 method ");
		
		String name="Praveen";
		model.addAttribute("user", name);
		return "sample";
		
	}

}
