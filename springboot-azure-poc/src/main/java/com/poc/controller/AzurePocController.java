package com.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("poc")
public class AzurePocController {
	
	@GetMapping("/message")
	public String getMessage () {
		
		return "Hello from AzurePocController controller!!";
	}

}
