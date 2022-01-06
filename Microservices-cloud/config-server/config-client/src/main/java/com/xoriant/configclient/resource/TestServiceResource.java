package com.xoriant.configclient.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestServiceResource {
	
	
	@Value("${msg}")
	private String textMessage;

	@GetMapping
	public String f1() {
		return textMessage;
	}
	
	
}
