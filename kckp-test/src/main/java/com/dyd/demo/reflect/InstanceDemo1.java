package com.dyd.demo.reflect;

/**
 * 调用无参构造赋值
 * @author  caowh
 * E-mail: 458584881@qq.com
 * @date 创建时间：2017年5月7日 下午9:26:35
 */
public class InstanceDemo1 {

	public static void main(String[] args) {
		Class<?> c=null;
		try {
			c=Class.forName("com.yunst.demo.reflect.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per=null;
		try {
			per=(Person) c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		per.setName("疯狂的程序员");
		per.setAge("20");
		System.out.println(per);
	}
}