package com.springframework.restful.model;

public class Product {
	
	private final long id;
	private final String name;
	private final int price;
	
	public Product(long id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
