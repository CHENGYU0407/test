package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookContainer2 {

Book book;

public Book getBook() {
	return book;
}
@Autowired
public void setBook(Book book) {
	this.book = book;
}

}
