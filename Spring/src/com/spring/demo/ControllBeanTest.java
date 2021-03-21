package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factorybean.MyBean;

public class ControllBeanTest {
	/*
	 * 1、Spring中有两种bean，一种是普通bean，一种是factorybean
	 * 1）普通bean:在Spring配置文件中，定义的类型就是返回的类型
	 * 2)工厂bean:在配置文件中，定义的类型和返回的类型可以不一样
	 * 
	 * 2、bean的作用域
	 * 1)创建的bean是单实例还是多实例对象（默认是单实例对象)
	 * 2）如何设置是多实例对象呢?
	 * scope属性设置,prototype就是多实例(proto表示原始的,原型)
	 * prototype并不是加载文件的时候创建对象，而是调用方法的时候再去创建对象！
	 *request表示一次请求，session表示一次会话
	 *
	 *3、bean的生命周期
	 *bean的生命周期:
	 *1）通过构造器创造bean实例
	 *2）为bean的属性设置值(调用set方法)
	 *3)调用bean中的初始化的方法(需要配置) init-method(配置文件中初始化方法的属性设置)
	 *4)bean可以被使用
	 *5)当容器被关闭的时候，被销毁。destroy-method(配置文件中销毁方法的属性设置)
	 *> 注:初始化和销毁的方法都需要被自己配置
	 *更完整的生命周期:bean的后置处理器//在初始化前后有两步操作
	 *1）通过构造器创造bean实例
	 *2）为bean的属性设置值(调用set方法)
	 *3)把bean的实例传递给后置处理器的方法
	 *4)调用bean中的初始化的方法(需要配置) init-method(配置文件中初始化方法的属性设置)
	 *5)把bean的实例传递给后置处理器的另外的一个方法
	 *6)bean可以被使用
	 *7)当容器被关闭的时候，被销毁。destroy-method(配置文件中销毁方法的属性设置)
	 *
	 *4、XML的自动装配方式
	 *1)根据指定的装配规则(属性名、类型),在Spring中会进行匹配自动注入【简化做法】
	 *
	 *5、可以外部文件
	 *
	 */
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean5.xml");
	Book book1=context.getBean("test",Book.class);
	Book book2=context.getBean("test",Book.class);
    System.out.println(book1.equals(book2));
}
}
