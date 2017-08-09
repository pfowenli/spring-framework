package com.springframework.example04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");

		Messenger messenger = (Messenger) appContext.getBean("greetings-d");
		messenger.getMessage();

		appContext.registerShutdownHook();
	}
}
