package com.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.spring.demo.Book;

public class MyBean implements FactoryBean<Book>{

	@Override
	public Book getObject() throws Exception {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setName("Spring");
		return book;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	
/*
 * 还有个方法是是否是单例
 */
}
