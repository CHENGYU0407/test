package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDaoImpl;
import service.UserService;

public class ExternalAndInternalInjectionTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean3.xml");
	UserService user=context.getBean("service",UserService.class);
	/*UserDaoImpl dao=context.getBean("d1",UserDaoImpl.class);//�ڲ�bean����ֱ��getBean()���з���
*/	user.add();
    System.out.println(user.getDao().getName());
}
}
