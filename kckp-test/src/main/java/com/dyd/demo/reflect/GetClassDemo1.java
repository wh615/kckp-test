package com.dyd.demo.reflect;
class X{
	private String name;
	
	public X() {
		super();
	}

	public X(String name){
		this.name=name;
	}
}

public class GetClassDemo1 {

	public static void main(String[] args) {
		X x=new X();
		System.out.println(x.getClass().getName());
		System.out.println(x.getClass().getTypeName());
		System.out.println(x.getClass().getConstructors());
		System.out.println(x.getClass().getDeclaredFields());
		
	}
}
