package com.example.SpringWeb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringWeb.Model.Products;
import com.example.SpringWeb.Service.ProductService;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
//	@RequestMapping("/products") We can use both but when u have same url for both the methods you have to use GetMapping
	@GetMapping("/products")
	public ResponseEntity<List<Products>> getProducts() {
		return  new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);	
		}
	@RequestMapping("/products/{prodId}")
	public Products getProductById(@PathVariable int prodId){
		return productService.getProductById(prodId);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Products prod) {
		productService.addProduct(prod);
		
	}
	@PutMapping("/products")
	public void updateProduct(@RequestBody Products prod) {
		productService.updateProduct(prod);
		
	}
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable  int prodId) {
		productService.deleteProdById(prodId);
	}
	
	
//	this method is generating a csrf token to use pos, put, delete mapping when we use spring security feature
	@GetMapping("/csrftoken")
	public CsrfToken getCsrftoken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
		
	}
}
