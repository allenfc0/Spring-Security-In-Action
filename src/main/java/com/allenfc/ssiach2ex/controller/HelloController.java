package com.allenfc.ssiach2ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path = "/")
	public String home() {
		return "home";
	}
	
	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello!";
	}
}
