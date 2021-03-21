package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beans4Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean4.xml");
	ArrayAndCollectionInjectionTest AACIT=context.getBean("bean4",ArrayAndCollectionInjectionTest.class);
	System.out.println(AACIT.getArray());
	System.out.println(AACIT.getMap());
	System.out.println(AACIT.getList());
}
}
