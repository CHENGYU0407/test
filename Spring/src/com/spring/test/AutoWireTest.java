package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.Student;

public class AutoWireTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean7.xml");
	Student stu=context.getBean("test",Student.class);
	System.out.println(stu);
}
}
