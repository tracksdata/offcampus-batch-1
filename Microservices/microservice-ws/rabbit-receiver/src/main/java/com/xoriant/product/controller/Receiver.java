package com.xoriant.product.controller;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

@Controller
public class Receiver {
	
	
	@RabbitListener(queues = "TestQ")
	public void f1(String msg) {
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		System.out.println(">>> MESSAGE:: "+msg);
		System.out.println("<<<<<<<<<<<<<<<<<<<");
		//return "Mesaage: "+msg;
	}
	
	@RabbitListener(queues = "TestQ1")
	public void f2(Map<String, Object> orderInfo) {
		
		
		System.out.println("------------------------------------------");
		System.out.println(orderInfo.get("ORDER_ID"));
		System.out.println(orderInfo.get("ORDER_DATE"));
		System.out.println(orderInfo.get("TOTAL"));
		System.out.println(orderInfo.get("USER"));
		System.out.println("------------------------------------------");

		
		
		
		//return "Mesaage: "+msg;
	}

}



