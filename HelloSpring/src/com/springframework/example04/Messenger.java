package com.springframework.example04;

public class Messenger {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Message: " + message);
	}

	public void init() {
		System.out.println("Bean will be initialized.");
	}

	public void destroy() {
		System.out.println("Bean will be destroyed.");
	}
}