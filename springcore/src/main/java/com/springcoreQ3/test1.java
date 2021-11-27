package com.springcoreQ3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  


public class test1
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcoreQ3/Q3.xml");  
        BankC obj=(BankC)context.getBean("obj");  
        obj.withdraw();     
        }
}