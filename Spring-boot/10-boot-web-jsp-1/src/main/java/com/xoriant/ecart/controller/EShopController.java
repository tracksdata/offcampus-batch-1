package com.xoriant.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.entity.Product;

@Controller
public class EShopController {
	
	@Autowired
	private ProductDao prodDao;
	
	// load index page
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	// load product form
	
	@RequestMapping("/loadProductForm")
	public String loadProductForm() {
		return "product-form";
	}
	
	// load Product Search form
	@RequestMapping("/loadProductSearchForm")
	public String loadProductSearchForm() {
		return "search";
	}
	
	//load Product Update Form
	@RequestMapping("/loadProductUpdateForm")
	public String loadProductUpdateForm() {
		return "update";
	}
	
	
	
	@RequestMapping("/listAll")
	public String listAllProducts(Model model) {
		
		List<Product> products = prodDao.findAll();
		model.addAttribute("prods", products);
		
		return "products";
	}
	
	// find products
	@RequestMapping("/findById")
	public String findById(@RequestParam int id) {
		
		return "product";
	}
	
	// save product
	
	@RequestMapping("/saveProduct")
	public String save(@ModelAttribute Product product) {
		return "products";
	}
	
	@RequestMapping("/updateProduct")
	public String updateProduct(@ModelAttribute Product product) {
		return "products";
	}
	
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam int id) {
		return "products";
	}
	
	
	

}
