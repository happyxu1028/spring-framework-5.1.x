package com.test;

import com.learning.lookup.Person;
import com.learning.replace.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-25 13:36
 */
public class ReplaceTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-replace.xml");
		MyCalculator lagouBean = applicationContext.getBean(MyCalculator.class);
		lagouBean.calc(1,10);
	}
}
