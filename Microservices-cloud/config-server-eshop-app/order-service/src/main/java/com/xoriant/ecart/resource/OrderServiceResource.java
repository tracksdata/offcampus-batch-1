package com.xoriant.ecart.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.ecart.entity.Order;
import com.xoriant.ecart.service.OrderSereviceImpl;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
@RefreshScope
public class OrderServiceResource {
	@Value("${gift_voucher}")
	private String giftVoucher;
	@Autowired
	private OrderSereviceImpl os;
	
	@PostMapping("/{userId}")
	public List<Order> placeOrder(@PathVariable int userId) {
		System.out.println("==================================================");
		System.out.println("ORDER-SERVICE :: GIFT VOUCHER APPLIIED. CODE:: "+giftVoucher);
		System.out.println("==================================================");

		return os.placeOrder(userId);
		
	}
	

}
