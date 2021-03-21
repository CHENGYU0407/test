package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.LifeCircle;

public class LifeCircleTest {
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("Bean6.xml");
LifeCircle test=context.getBean("test",LifeCircle.class);
System.out.println("第四步:使用对象");
//一定不要写成ClassPathXmlApplicationContext)context.close()
((ClassPathXmlApplicationContext)context).close();
}
}
