/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day1;

/**
 *
 * @author ANDROID
 */
public class HelloWolrd {

    static String msg = "Hellow World!";
    String greeting = "Welcome to Android Course!";
 String welcome;
 
    public static void main(String[] args) {
        System.out.println("Message: " + msg);
        
        HelloWolrd obj1=new HelloWolrd();
 
        System.out.println("Greeting: "+  obj1.getGreeting());
        
    }

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        HelloWolrd.msg = msg;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

   
    
    
}
