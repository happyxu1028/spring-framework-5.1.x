package com.learning.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-25 13:49
 */
public class ReplaceMethodCalculator implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("这里被替换了");
		return "a";
	}
}
