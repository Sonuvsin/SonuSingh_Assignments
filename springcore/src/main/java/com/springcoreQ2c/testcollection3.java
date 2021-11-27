package com.springcoreQ2c;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testcollection3 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcoreQ2c/Q3c.xml");
Collection3 set = (Collection3) context.getBean("set");
        
        System.out.println(set.getQuestionId());
        System.out.println(set.getQuestions());
        System.out.println(set.getAnswers());
    }
}