package com.pure_annotation_development;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.demo.*;
import com.spring.test.Test;

public class PureAnnotationTest {
/*完全配置开发:(实际开发中，基于SpringBoot做到)
 * 1、注解配置类,先申明配置类@Confuguration
 * 2、注解扫描标@ComponentScan(basePackages="")
 */
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(context.getBean("test",Test.class));
	}
}
