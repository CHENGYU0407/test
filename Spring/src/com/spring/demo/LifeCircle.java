package com.spring.demo;

public class LifeCircle {
int name;
LifeCircle(){
	System.out.println("第一步:创建实例");
}
public void setName(int name) {
	System.out.println("第二步:为bean的属性设置值");
	this.name=name;
}
public void init() {
	System.out.println("第三步:初始化");
}
public void destroy() {
	System.out.println("第五步:销毁");
}
}
