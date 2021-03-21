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
	  //注意，如果Dao为接口，而且接口有多个实现类，我们这时候需要通过@Qualifier搭配一起使用，value值指定是哪个具体实现类
	  
	  @Qualifier(value="dao_")

Dao_ dao;
public void say() {
	System.out.println("Hello Service"+name);
	dao.say();
}
}
