package com.lagou.edu.aspect;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-02-13 18:43
 */
@Component
@EnableAspectJAutoProxy
public class MyBean{


	public String print(){
		return "abcdefg";
	}
}
