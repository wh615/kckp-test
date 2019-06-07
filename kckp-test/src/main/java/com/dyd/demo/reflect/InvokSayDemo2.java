package com.dyd.demo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokSayDemo2 {

	public static void main(String[] args) throws Exception {
		Class<?> c = null;
		try {
			c = Class.forName("com.dyd.demo.reflect.Person1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method method = c.getMethod("sayChina");
		method.invoke(c.newInstance());
	}
}
