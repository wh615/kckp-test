package com.dyd.demo.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {

		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add("刘备");
		hashSet.add("关羽");
		hashSet.add("张飞");
		hashSet.add("赵云");
		hashSet.add("马超");
		hashSet.add("黄忠");
		hashSet.add("刘备");
		System.out.println("集合元素为："+hashSet);
		
		TreeSet<User> treeSet = new TreeSet<>();
		
		//treeSet.add("刘备");
		//treeSet.add("关羽");
		//treeSet.add("张飞");
		//treeSet.add("赵云");
		//treeSet.add("马超");
		//treeSet.add("黄忠");
		//treeSet.add("刘备");
		
		User user1 = new User("刘备","河北","蜀国皇帝",1800);
		User user2 = new User("关羽","山西","五虎上将",1801);
		User user3 = new User("张飞","河北","五虎上将",1802);
		User user4 = new User("赵云","河北","五虎上将",1803);
		User user5 = new User("马超","甘肃","五虎上将",1804);
		User user6 = new User("黄忠","湖南","五虎上将",1805);
		User user7 = new User("黄忠","湖南","五虎上将1",1805);
		treeSet.add(user1);
		treeSet.add(user2);
		treeSet.add(user3);
		treeSet.add(user4);
		treeSet.add(user5);
		treeSet.add(user6);
		treeSet.add(user7);
		System.out.println("集合元素为："+treeSet);
		
		
	}

}
