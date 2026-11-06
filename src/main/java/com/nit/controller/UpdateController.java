package com.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {
	
	@PostMapping("/update")
	public ResponseEntity<String> updateStudent() {
		return new ResponseEntity<String>("Updated", HttpStatus.OK);
	}
}
