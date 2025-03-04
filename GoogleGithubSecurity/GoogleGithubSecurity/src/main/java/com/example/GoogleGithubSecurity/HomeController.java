package com.example.GoogleGithubSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String message() {
		return "Hello, This is API Security from Google/Github";
		
	}

}
