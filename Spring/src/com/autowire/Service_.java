package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service(value="text")
public class Service_ {
	
	 @Value(value="1")
int name;
	 @Autowired
	  //ע�⣬���DaoΪ�ӿڣ����ҽӿ��ж��ʵ���࣬������ʱ����Ҫͨ��@Qualifier����һ��ʹ�ã�valueֵָ�����ĸ�����ʵ����
	  
	  @Qualifier(value="dao_")

Dao_ dao;
public void say() {
	System.out.println("Hello Service"+name);
	dao.say();
}
}
