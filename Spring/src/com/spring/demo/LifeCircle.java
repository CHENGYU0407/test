package com.spring.demo;

public class LifeCircle {
int name;
LifeCircle(){
	System.out.println("��һ��:����ʵ��");
}
public void setName(int name) {
	System.out.println("�ڶ���:Ϊbean����������ֵ");
	this.name=name;
}
public void init() {
	System.out.println("������:��ʼ��");
}
public void destroy() {
	System.out.println("���岽:����");
}
}
