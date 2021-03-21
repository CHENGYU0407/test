package com.spring.test;

import java.lang.reflect.InvocationTargetException;

import com.spring.demo.User;

public class Process {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	//下面为模拟Spring的过程
	//1、解析xml得到class文件的路径
	String classPath="com.spring.demo.User";
	//2、只是得到class字节码文件
	Class<?> clazz=Class.forName(classPath);
	//直接clazz.newinstance被遗弃了
	User user=(User) clazz.getDeclaredConstructor().newInstance();
	user.say();
}
}
