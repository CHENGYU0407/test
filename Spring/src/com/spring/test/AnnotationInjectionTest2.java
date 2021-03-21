package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.BookContainer2;

public class AnnotationInjectionTest2 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("injection2.xml");
	BookContainer2 book=context.getBean("bookContainer2",BookContainer2.class);
	System.out.println(book.getBook());
}
}
