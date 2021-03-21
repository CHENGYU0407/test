package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.demo.User;
@Service
public class Test {
public static void main(String[] args) {
	/*1、加载spring的配置文件,BeanFactory和ApplicationContext都可以
	 * BeanFactory是Spring中内置的接口，一般不建议使用，加载的时候不会创建对象
	 *使用才会创建对象
	 *
	 * ApplicationContext是BeanFactory的子接口，功能更强大，推荐使用，只要
	 * 加载xml就会创建对象(服务器启动的时候就完成创建，在使用的时候就不会耗时，更快，
	 * 特别是web项目)
	 * 
	 * FileSystemXmlApplication是找盘路径
	 * 
	 * 
	 * Bean管理指的两个操作:1）创建对象2）注入属性
	 * 1)创建对象默认是找无参构造方法的！
	 * 2)DI(Dependence Injection)
	 * 
	 * 
	 * Bean管理操作的两种方式:1)配置文件方式2)注解方式
	 */
	BeanFactory context=new FileSystemXmlApplicationContext("D:\\java2\\Spring\\bin\\com\\spring\\demo\\beans1.xml");
	//2、得到对象
	/*
	 * User user=(User) context.getBean("user"); System.out.println(user);
	 * user.say();
	 */
}
}
