package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.Service_;

public class Demo02 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean01.xml");
	Service_ text=context.getBean("text",Service_.class);
    text.say();	
}
}
