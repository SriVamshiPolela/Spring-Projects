package com.example.SpringSecurity.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurity.Model.Student;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	
	private List<Student> students = new ArrayList<Student>(List.of(
			new Student(1,"Vamshi"),
			new Student(2, "Nikki")));
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
		
	}
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		students.add(student);
		
		return student;
		
	}
	
	@GetMapping("/csrftoken")
	public CsrfToken getCsrftoken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
		
	}

}
