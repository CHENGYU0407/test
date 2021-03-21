package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factorybean.MyBean;

public class ControllBeanTest {
	/*
	 * 1��Spring��������bean��һ������ͨbean��һ����factorybean
	 * 1����ͨbean:��Spring�����ļ��У���������;��Ƿ��ص�����
	 * 2)����bean:�������ļ��У���������ͺͷ��ص����Ϳ��Բ�һ��
	 * 
	 * 2��bean��������
	 * 1)������bean�ǵ�ʵ�����Ƕ�ʵ������Ĭ���ǵ�ʵ������)
	 * 2����������Ƕ�ʵ��������?
	 * scope��������,prototype���Ƕ�ʵ��(proto��ʾԭʼ��,ԭ��)
	 * prototype�����Ǽ����ļ���ʱ�򴴽����󣬶��ǵ��÷�����ʱ����ȥ��������
	 *request��ʾһ������session��ʾһ�λỰ
	 *
	 *3��bean����������
	 *bean����������:
	 *1��ͨ������������beanʵ��
	 *2��Ϊbean����������ֵ(����set����)
	 *3)����bean�еĳ�ʼ���ķ���(��Ҫ����) init-method(�����ļ��г�ʼ����������������)
	 *4)bean���Ա�ʹ��
	 *5)���������رյ�ʱ�򣬱����١�destroy-method(�����ļ������ٷ�������������)
	 *> ע:��ʼ�������ٵķ�������Ҫ���Լ�����
	 *����������������:bean�ĺ��ô�����//�ڳ�ʼ��ǰ������������
	 *1��ͨ������������beanʵ��
	 *2��Ϊbean����������ֵ(����set����)
	 *3)��bean��ʵ�����ݸ����ô������ķ���
	 *4)����bean�еĳ�ʼ���ķ���(��Ҫ����) init-method(�����ļ��г�ʼ����������������)
	 *5)��bean��ʵ�����ݸ����ô������������һ������
	 *6)bean���Ա�ʹ��
	 *7)���������رյ�ʱ�򣬱����١�destroy-method(�����ļ������ٷ�������������)
	 *
	 *4��XML���Զ�װ�䷽ʽ
	 *1)����ָ����װ�����(������������),��Spring�л����ƥ���Զ�ע�롾��������
	 *
	 *5�������ⲿ�ļ�
	 *
	 */
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean5.xml");
	Book book1=context.getBean("test",Book.class);
	Book book2=context.getBean("test",Book.class);
    System.out.println(book1.equals(book2));
}
}
