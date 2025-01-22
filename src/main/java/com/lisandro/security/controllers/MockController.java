package com.lisandro.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MockController {

	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "Hello there! This is your session id: " + request.getSession().getId();
	}
}
