package com.example.SpringBootWar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test")
	public ResponseEntity doTest() {
		return ResponseEntity.ok("Test Ok");
	}

}
