package com.dyd.demo.reflect;

import java.lang.reflect.Constructor;

/**
 * 获取类中的所有构造器
 * 
 * @author caowh E-mail: 458584881@qq.com
 * @date 创建时间：2017年5月7日 下午9:49:09
 */
public class InstanceDemo4 {

	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.dyd.demo.reflect.Person1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?>[] constructors = c.getConstructors();
		for(int index=0;index<constructors.length;index++){
			Class<?>[] parameterTypes = constructors[index].getParameterTypes();
			System.out.print("构造方法：");
			System.out.print(constructors[index].getModifiers());
			System.out.print(constructors[index].getName());
			System.out.print("(");
			for(int j=0;j<parameterTypes.length;j++){
				System.out.print(parameterTypes[j].getName()+"args"+index);
					
				if(j<parameterTypes.length-1){
					System.out.print(",");
				}
			}
			System.out.println("){}");
		}
			
	}
}
