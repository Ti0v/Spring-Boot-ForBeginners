package com.example.demo.Course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employy {

	@GetMapping("/emp")
	public String GetPlay() {
		return "I.m The Playes";
		
	} 

	

	
}
