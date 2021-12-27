package com.xoriant.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	
	@RequestMapping(value = "/s1")
	public String f1() {
		return "sample";
		
	}

}
