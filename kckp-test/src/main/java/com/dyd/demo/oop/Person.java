package com.dyd.demo.oop;

public class Person {

	static{
		int i=10;
		if(i>6){
			System.out.println("初始化静态块");
		}
	}
	{
		System.out.println("实例化代码块");
	}
	

	public Person() {
		super();
		System.out.println("无参构造器代码块");
	}

	public void say(){
		System.out.println("开始重新找工作");
	}
	
	public static void main(String[] args) {
		
		new Person().say();
	}
}
