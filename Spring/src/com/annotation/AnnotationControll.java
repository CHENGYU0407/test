package com.annotation;

public class AnnotationControll {
	/*注解有(下面注解功能其实是一样的，名称不同只是为了更清晰的分层)
	 * @Component
	 * @Service  用于业务逻辑层
	 * @Controller  用于web层
	 * @Respository 用于dao层
	 * 注解控制:
	 * 1)引入包
	 * 2)context命名空间
	 * 3)申明可以被扫描的包
	 * <context:component-scan base-package="com.spring.demo,spring.demo.dao，···"></context:component-scan>
	 * 4)在类前面申明可以被扫描
	 * 
	   *  开启组件扫描中的配置:use-default-filters
	   *  <context:exclude-filter···>
	   *  
	   *  基于注解进行属性注入:
	   *  //下面为对象类型的注入
	   *  @AutoWired：根据属性类型注入
	   *  @Qualifier:根据属性名称注入
	   *  @Resource:既可以根据属性注入，也可以根据名称注入
	   *  //下面为属性类型的注入
	   *  @Value
	 *  
	 */
public static void main(String[] args) {
	
}
}
