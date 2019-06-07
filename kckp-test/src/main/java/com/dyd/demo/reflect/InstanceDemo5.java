package com.dyd.demo.reflect;

import java.lang.reflect.Constructor;

/**
 * 获取类中的所有构造器
 * 
 * @author caowh E-mail: 458584881@qq.com
 * @date 创建时间：2017年5月7日 下午9:49:09
 */
public class InstanceDemo5 {

	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.dyd.demo.reflect.Person1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?>[] constructors = c.getConstructors();
		for(int index=0;index<constructors.length;index++){
			System.out.println(constructors[index]);
		}
			
	}
}
