package com.spring.test;

import java.lang.reflect.InvocationTargetException;

import com.spring.demo.User;

public class Process {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	//����Ϊģ��Spring�Ĺ���
	//1������xml�õ�class�ļ���·��
	String classPath="com.spring.demo.User";
	//2��ֻ�ǵõ�class�ֽ����ļ�
	Class<?> clazz=Class.forName(classPath);
	//ֱ��clazz.newinstance��������
	User user=(User) clazz.getDeclaredConstructor().newInstance();
	user.say();
}
}
