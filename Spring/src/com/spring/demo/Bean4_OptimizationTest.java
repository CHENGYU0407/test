package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean4_OptimizationTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean4_Optimization.xml");
	  ArrayAndCollectionInjectionTest
	  test1=context.getBean("6",ArrayAndCollectionInjectionTest.class);
	  ArrayAndCollectionInjectionTest
	  test2=context.getBean("8",ArrayAndCollectionInjectionTest.class);
	  System.out.println(test1.getList()); 
	  System.out.println(test2.getList());
	 
}
}
