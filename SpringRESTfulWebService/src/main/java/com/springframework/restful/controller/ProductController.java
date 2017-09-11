package com.springframework.restful.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.restful.model.Product;

@RestController
public class ProductController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/product")
	public Product product(@RequestParam(value = "name", defaultValue = "Notebook") String productName, 
			@RequestParam(value = "price", defaultValue = "25000") String price) {
		return new Product(counter.incrementAndGet(), productName, Integer.parseInt(price));
	}
}
