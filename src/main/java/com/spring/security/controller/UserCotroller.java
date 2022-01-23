package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCotroller {

	@GetMapping("/")
	public String getWelcome() {
		return "Welcome";
	}
	
	@GetMapping("/admin")
	public String getWelcomeAdmin() {
		return "Welcome admin";
	}
	
	@GetMapping("/user")
	public String getWelcomeUser() {
		return "Welcome user";
	}
	
}
