package com.springframework.example03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoTypeApp {
	
   public static void main(String[] args) {
	   
      ApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");
      
      Messenger messengerA = (Messenger) appContext.getBean("greetings-c");
      messengerA.setMessage("This is Messenger A.");
      
      Messenger messengerB = (Messenger) appContext.getBean("greetings-c");
      messengerB.setMessage("This is Messenger B.");
      
      messengerA.getMessage();
      messengerB.getMessage();
      
      ((ConfigurableApplicationContext) appContext).close();
   }
}
