package com.spring.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("初始化后");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("初始化前");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
