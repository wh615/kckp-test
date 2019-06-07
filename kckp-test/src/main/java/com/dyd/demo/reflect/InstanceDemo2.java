package com.dyd.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 调用有参构造
 * @author  caowh
 * E-mail: 458584881@qq.com
 * @date 创建时间：2017年5月7日 下午9:27:11
 */
public class InstanceDemo2 {

	public static void main(String[] args)  {
		Class<?> c=null;
		try {
			c=Class.forName("com.dyd.demo.reflect.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per=null;
		Constructor<?>[] cons=c.getConstructors();
		 try {
			per = (Person) cons[1].newInstance("曹万合","20");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 System.out.println(per);
	}
}