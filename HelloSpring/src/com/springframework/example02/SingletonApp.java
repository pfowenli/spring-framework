package com.springframework.example02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonApp {
	
   public static void main(String[] args) {
	   
      ApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");
      
      Messenger messengerA = (Messenger) appContext.getBean("greetings-b");
      messengerA.setMessage("This is Messenger A.");
      
      Messenger messengerB = (Messenger) appContext.getBean("greetings-b");
      messengerB.setMessage("This is Messenger B.");
      
      messengerA.getMessage();
      messengerB.getMessage();
      
      ((ConfigurableApplicationContext) appContext).close();
   }
}
