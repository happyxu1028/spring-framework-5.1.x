package com.learning.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-01 20:38
 */
@Service
public class UserService  {

	@Autowired
	private MyBean myBean;


	@Autowired
	public void setMyName(MyName myName){
		System.out.println("MyName属性注入"+myName.name);
	}

	private String name;

	public void print() {
		System.out.println(1111);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public UserService() {
		System.out.println("无参构造");
	}

	public UserService(String name) {
		System.out.println("有参构造");
		this.name = name;
	}
}
