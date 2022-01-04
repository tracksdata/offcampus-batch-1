package com.xoriant.product.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;


@Controller
public class Sender {
	
	@Autowired
	private RabbitTemplate rt;
	
	@Bean
	public Queue f1() {
		return new Queue("TestQ", true);
	}
	
	@Bean
	public Queue f2() {
		return new Queue("TestQ1", true);
	}
	
	
	
	@Bean
	public void sendMessage() {
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("ORDER_ID", "OOOOAbc001");
		data.put("ORDER_DATE", LocalDateTime.now());
		data.put("TOTAL", 35000);
		data.put("USER", "praveen");
		rt.convertAndSend("TestQ","This is new message v4... ");
		rt.convertAndSend("TestQ1",data);
	}
	
	

}
