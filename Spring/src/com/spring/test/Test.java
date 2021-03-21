package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.demo.User;
@Service
public class Test {
public static void main(String[] args) {
	/*1������spring�������ļ�,BeanFactory��ApplicationContext������
	 * BeanFactory��Spring�����õĽӿڣ�һ�㲻����ʹ�ã����ص�ʱ�򲻻ᴴ������
	 *ʹ�òŻᴴ������
	 *
	 * ApplicationContext��BeanFactory���ӽӿڣ����ܸ�ǿ���Ƽ�ʹ�ã�ֻҪ
	 * ����xml�ͻᴴ������(������������ʱ�����ɴ�������ʹ�õ�ʱ��Ͳ����ʱ�����죬
	 * �ر���web��Ŀ)
	 * 
	 * FileSystemXmlApplication������·��
	 * 
	 * 
	 * Bean����ָ����������:1����������2��ע������
	 * 1)��������Ĭ�������޲ι��췽���ģ�
	 * 2)DI(Dependence Injection)
	 * 
	 * 
	 * Bean������������ַ�ʽ:1)�����ļ���ʽ2)ע�ⷽʽ
	 */
	BeanFactory context=new FileSystemXmlApplicationContext("D:\\java2\\Spring\\bin\\com\\spring\\demo\\beans1.xml");
	//2���õ�����
	/*
	 * User user=(User) context.getBean("user"); System.out.println(user);
	 * user.say();
	 */
}
}
