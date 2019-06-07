package com.dyd.demo.oop;

public class InstanceDemo {

	public static void main(String[] args) {
		Object hello="helloWorld";
		
		System.out.println(hello instanceof Object);
		System.out.println(hello instanceof String);
		
		
		System.out.println(hello instanceof Math);
		System.out.println(hello instanceof Comparable);
	}
}
