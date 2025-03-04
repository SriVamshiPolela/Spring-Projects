package com.example.SpringWeb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String getMessage(HttpServletRequest request) {
		return"Welcome to Home Page  " +request.getSession().getId();
	}
}
