package com.autowire;

public class Student {
Book boo;//注意:一旦修改变量名称一定要记住全部修改

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
