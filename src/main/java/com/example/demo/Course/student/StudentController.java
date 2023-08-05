package com.example.demo.Course.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	@GetMapping
	public List<String> AllStudent(){
		return List.of(
				
				"Mazen","Mohammed","Ahmeed"
				);
				
		
	}
	
}
