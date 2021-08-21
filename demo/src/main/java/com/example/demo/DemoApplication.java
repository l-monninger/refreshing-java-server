package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	private final String DEFAULT_WELCOME = "Hello!";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String main(@RequestParam(value = "name", defaultValue = "World") String url){
		return DEFAULT_WELCOME;
	}

}
