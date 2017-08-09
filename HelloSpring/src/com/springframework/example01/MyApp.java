package com.springframework.example01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
   public static void main(String[] args) {
	   
      ApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");
      
      Messenger messenger = (Messenger) appContext.getBean("greetings-a");
      messenger.getMessage();
      
      ((ConfigurableApplicationContext) appContext).close();
   }
}
