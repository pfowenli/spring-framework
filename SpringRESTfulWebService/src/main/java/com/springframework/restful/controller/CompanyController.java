package com.springframework.restful.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.restful.model.Company;

@RestController
public class CompanyController {
	
	private final AtomicLong counter1 = new AtomicLong();
	
	@RequestMapping("/company")
	public Company company(@RequestParam(value = "name", defaultValue = "OneZeroZero") String companyName) {
		return new Company(counter1.incrementAndGet(), companyName);
	}

}
