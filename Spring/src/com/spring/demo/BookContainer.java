package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookContainer {
Book book;
@Autowired
/*
 * Ϊʲôû��AutoWiredҲ�ܳɹ��صõ���Bean?
 */
public BookContainer(Book book) {
	this.book=book;
}
public Book getBook() {
	// TODO Auto-generated method stub
	return this.book;
}
}
