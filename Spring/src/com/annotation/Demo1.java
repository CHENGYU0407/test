package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.*;

public class Demo1 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean00.xml");
	Book book=context.getBean("book",Book.class);
//	User book1=context.getBean("User1",User.class);
	System.out.println(book);
//	System.out.println(book1);
	((ClassPathXmlApplicationContext)context).close();
}
}
