package com.autowire;

public class Student {
Book boo;//ע��:һ���޸ı�������һ��Ҫ��סȫ���޸�

public Book getBook() {
	return boo;
}

public void setBook(Book book) {
	this.boo = book;
}

@Override
public String toString() {
	return "Student [book=" + boo + "]";
}

}
