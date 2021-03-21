package com.spring.demo;

import org.springframework.stereotype.Service;

@Service(value="User1")//value相当于id
public class User {
	static {
		System.out.println("加载成功");
	}
int age;
public User() {
	this.age=1;
}
public void say() {
	System.out.println("1");
}
}
