package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.BookContainer;

public class InjectionTest {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(Config_.class);
	BookContainer container=context.getBean("bookContainer",BookContainer.class);
	System.out.println(container.getBook().getName());
}
}
