package com.dyd.demo.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	
	public static void main(String[] args) {

		//创建集合1
		Collection c1=new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//创建集合2
		Collection c2=new ArrayList();
		c2.add("abc1");
		c2.add("abc2");
		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");
		//c2.addAll(c2);
		System.out.println("addAll:"+c1.add(c2));
		System.out.println(c1);
		System.out.println("集合是否包含:====="+c1.contains(c2));
		//做集合的交集
		System.out.println("retainAll:"+c1.retainAll(c2));
		System.out.println("retainAll:"+c2.retainAll(c1));
		System.out.println("集合值为："+c1);
	}
}
