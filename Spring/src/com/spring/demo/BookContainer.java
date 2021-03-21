package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookContainer {
Book book;
@Autowired
/*
 * 为什么没有AutoWired也能成功地得到该Bean?
 */
public BookContainer(Book book) {
	this.book=book;
}
public Book getBook() {
	// TODO Auto-generated method stub
	return this.book;
}
}
