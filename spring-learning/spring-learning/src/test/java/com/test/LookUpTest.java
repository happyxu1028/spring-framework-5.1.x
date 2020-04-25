package com.test;

import com.learning.lookup.Person;
import com.learning.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-25 13:36
 */
public class LookUpTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-lookup.xml");
		Person lagouBean = applicationContext.getBean(Person.class);
		lagouBean.read();
	}
}
