package com.xoriant.priceservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.priceservice.service.PriceService;

@RestController
@RequestMapping("/api/price")
@CrossOrigin
@RefreshScope
public class PriceServiceResoure {

	@Value("${discount_code}")
	private String discountCode;

	@Autowired
	private PriceService priceService;

	@GetMapping("/{productId}")
	public double getProductPrice(@PathVariable int productId) {
		System.out.println("==========================================");
		System.out.println("PRICE SERVICE:: DISCOUNT CODE APPLIED:: " + discountCode);
		System.out.println("==========================================");
		return priceService.getPrice(productId);
	}

}
