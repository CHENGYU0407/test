package com.pure_annotation_development;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.demo.*;
import com.spring.test.Test;

public class PureAnnotationTest {
/*��ȫ���ÿ���:(ʵ�ʿ����У�����SpringBoot����)
 * 1��ע��������,������������@Confuguration
 * 2��ע��ɨ���@ComponentScan(basePackages="")
 */
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(context.getBean("test",Test.class));
	}
}
