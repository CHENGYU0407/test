package service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Book;
/*
 * 
 */

public class Test2 {
public static void main(String[] args) {
	ApplicationContext context=
			new ClassPathXmlApplicationContext("Beans2.xml");
	Book book=context.getBean("book",Book.class);
	System.out.println("name:"+book.getName()+" price:"+book.getPrice());
	Book book2=context.getBean("book222",Book.class);
	System.out.println("name2:"+book2.getName()+" price2:"+book2.getPrice());
	System.out.println("-----");
	ApplicationContext context2=new ClassPathXmlApplicationContext("Beans2_Optimization.xml");
	Book book3=context2.getBean("book",Book.class);
	System.out.println(book3.getName()+":"+":"+book3.getPrice()+book3.getSpecialSymbols());
}
}
