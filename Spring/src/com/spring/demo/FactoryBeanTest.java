package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factorybean.MyBean;

public class FactoryBeanTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean5.xml");
	Book test=context.getBean("test",Book.class);
	System.out.println(test.name);
}
}