package com.spring.demo;

import org.springframework.beans.factory.FactoryBean;

import com.spring.demo.LifeCircle;

public class MyBean2 implements FactoryBean<LifeCircle> {

	@Override
	public LifeCircle getObject() throws Exception {
		// TODO Auto-generated method stub
		LifeCircle circle=new LifeCircle();
		return circle;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

}
