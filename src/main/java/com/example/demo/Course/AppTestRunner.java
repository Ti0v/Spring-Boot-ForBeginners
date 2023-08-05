package com.example.demo.Course;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class AppTestRunner implements CommandLineRunner  ,ApplicationRunner{

	@Override
	public void run(String... args) throws Exception {
		System.err.println("Hi I.m Runner");
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.err.println("Hi I.m The Application  Runner");
		
		
	}

}
