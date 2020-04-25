package com.test;

import com.learning.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 长灵
 */
public class IocTest {




	/**
	 *  Ioc 容器源码分析基础案例
	 */
	@Test
	public void testAOP() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com");
		UserService lagouBean = applicationContext.getBean(UserService.class);
		lagouBean.print();
	}


	/**
	 *  Ioc 容器源码分析基础案例
	 */
	@Test
	public void testConstructor() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserService lagouBean = applicationContext.getBean(UserService.class);
		lagouBean.print();
	}




}
