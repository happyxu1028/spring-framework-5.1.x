package com.lagou.edu;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-02-02 19:11
 */
@Component
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("MyMethodInterceptor.invoke before");
		Object result = invocation.proceed();
		System.out.println("MyMethodInterceptor.invoke after");
		return result;
	}
}
