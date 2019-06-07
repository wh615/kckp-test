package com.dyd.demo.oop;

class Singleton{
	private Singleton(){
		}
	private static Singleton singleton;
	
	public synchronized static Singleton getInstance(){
		if(singleton==null){
			singleton=new Singleton();
		}
		return singleton;
	}
}
public class SingletonDemo1 {

	public static void main(String[] args) {
		
		Singleton singleton1 =Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1==singleton2);
	}
}
