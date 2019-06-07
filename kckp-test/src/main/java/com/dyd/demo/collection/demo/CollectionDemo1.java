package com.dyd.demo.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		//创建接口对象
		Collection<String> col=new ArrayList<>();
		boolean add = col.add("Hello");
		col.add("world");
		col.add("Java");
		
		System.out.println(add);
		Iterator<String> iterator = col.iterator();
		while(iterator.hasNext()){
			
			System.out.print(iterator.next()+"\\");
		}
		System.out.println();
		if(col.contains("Java")){
			System.out.println("Java在集合中");
		}
	}
}
