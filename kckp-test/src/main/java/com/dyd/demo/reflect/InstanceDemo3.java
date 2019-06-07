package com.dyd.demo.reflect;

/**
 * 通过反射获取类接口的名称
 * @author  caowh
 * E-mail: 458584881@qq.com
 * @date 创建时间：2017年5月7日 下午9:47:01
 */
public class InstanceDemo3 {

	public static void main(String[] args) {
		Class<?> c=null;
		try {
			c=Class.forName("com.dyd.demo.reflect.Person1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?>[] interfaces = c.getInterfaces();//获取接口的实例
		Class<?> superclass = c.getSuperclass();
		
		for(int index=0;index<interfaces.length;index++){
			System.out.println("实现接口的名字是："+interfaces[index].getName());
		}
		System.out.println(superclass.getName());
	}
}
