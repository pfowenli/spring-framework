package com.springframework.example05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("Beans05.xml");

		Messenger messenger = (Messenger) appContext.getBean("greetings-e");
		messenger.getMessage();

		appContext.registerShutdownHook();
	}
}
