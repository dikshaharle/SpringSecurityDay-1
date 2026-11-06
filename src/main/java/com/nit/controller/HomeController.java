package com.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello Diksha!!! Welcome to Spring Secutity" ,HttpStatus.OK);
	}
	
	@GetMapping("/getCsrf")
	public CsrfToken getCsrf(HttpServletRequest http) {
		return  (CsrfToken)  http.getAttribute("_csrf");
	}
	
}
