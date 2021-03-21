package com.pure_annotation_development;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//加注解是为了告诉Spring这是配置类
@Configuration
@ComponentScan(basePackages="com.spring.test")//注解扫描
public class SpringConfig {

}
