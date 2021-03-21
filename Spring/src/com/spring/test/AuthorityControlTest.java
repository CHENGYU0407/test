package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.LifeCircle;

public class AuthorityControlTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("AuthorityControlBeanTest.xml");
	LifeCircle lifeCircle=context.getBean("test",LifeCircle.class);
	System.out.println(lifeCircle);
	LifeCircle lifeCircle2=new LifeCircle();//bean是更倾向于一个工厂吗?
}
}
