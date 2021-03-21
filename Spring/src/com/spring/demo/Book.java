package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Book {
String name;
double price;
String specialSymbols;
public Book(String name,double price) {
	this.name=name;
	this.price=price;
}
public Book() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getSpecialSymbols() {
	return specialSymbols;
}
public void setSpecialSymbols(String specialSymbols) {
	this.specialSymbols = specialSymbols;
}

}
