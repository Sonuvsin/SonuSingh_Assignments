package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
     ApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore/Q1.xml");
     Customer customer = (Customer) context.getBean("customer");
     System.out.println(customer);
     
    }
}