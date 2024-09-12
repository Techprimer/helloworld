package com.techprimer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techprimer.entity.Product;
import com.techprimer.service.ProductService;

@RestController
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}
	

}
