package com.springframework.example01;

public class Messenger {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Message: " + message);
   }
}