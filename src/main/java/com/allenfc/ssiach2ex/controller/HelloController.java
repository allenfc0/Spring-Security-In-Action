package com.allenfc.ssiach2ex.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allenfc.ssiach2ex.security.UserDetailsServiceConfig;

@RestController
public class HelloController {
	
	Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping(path = "/")
	public String home() {
		
		log.warn("hello page +");
		
		return "home";
	}
	
	@GetMapping(path = "/hello")
	public String hello(Authentication a) {
		
//		SecurityContext context = SecurityContextHolder.getContext();
//		Authentication a = context.getAuthentication();
		
		return "Hello " + a.getAuthorities() + "!";
	}
}
