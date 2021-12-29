package com.xoriant.ecart.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {
	
	
	@GetMapping
	public String f1() {
		return "GET request";
	}
	
	
	@GetMapping("/data")
	public String f10(@RequestBody Object obj) {
		return "GET request::: "+obj;
	}
	
	
	@GetMapping("/{city}")
	public String f8(@PathVariable String city) {
		// DB
		return "<<<< SERVER:: GET request:: "+city;
	}
	
	
	@GetMapping("/{city}/{name}")
	public String f9(@PathVariable String city,@PathVariable String name) {
		// DB
		return "<<<< SERVER:: GET request:: "+city+" and name is "+name;
	}
	
	
	
	@GetMapping("/f1")
	public String f6() {
		return "GET request - 1";
	}
	
	@GetMapping("/f2")
	public String f7() {
		return "GET request - 2";
	}
	
	
	@PostMapping
	public String f2() {
		return "POST request";
	}
	
	@PutMapping
	public String f3() {
		return "PUT request";
	}
	
	@DeleteMapping
	public String f4() {
		return "DELETE request";
	}
	
	@PatchMapping
	public String f5() {
		return "PATCH request";
	}

}
