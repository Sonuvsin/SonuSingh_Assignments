package com.springcoreQ2a;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testcollection 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcoreQ2a/Q2a.xml");
        Collection collectionmap = (Collection) context.getBean("collectionmap");
        
        System.out.println(collectionmap.getQuestionId());
        System.out.println(collectionmap.getQuestions());
        System.out.println(collectionmap.getAnswers());
        
    }
}