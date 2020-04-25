package com.learning.lookup;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-25 13:32
 */
public abstract class Person {

	public void read(){

		System.out.println("许斌正在读"+getBook().getBookName());
	}


	public abstract Book getBook();
}
