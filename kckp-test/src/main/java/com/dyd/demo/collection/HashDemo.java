package com.dyd.demo.collection;

import java.util.HashSet;

public class HashDemo {

	public static void main(String[] args) {
		
		HashSet<Object> hashSet = new HashSet<>();
		
		hashSet.add(new Person("张三",30));
		hashSet.add(new Person("李四",31));
		hashSet.add(new Person("王五",32));
		hashSet.add(new Person("王五",32));
		hashSet.add(new Person("王五",32));
		hashSet.add(new Person("赵六",33));
		hashSet.add(new Person("孙七",34));
		System.out.println(hashSet);
		
	}
}
