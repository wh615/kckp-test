package com.dyd.demo.clazz;

public class StringBufferDemo3 {

	public static void main(String[] args) {
		
		StringBuffer buf=new StringBuffer();
		buf.append("Java软件开发前途无量");
		buf.insert(0, "学习Java软件开发");
		System.out.println(buf);
		buf.insert(buf.length(),"JavaEE~~~~~~");
		System.out.println(buf);
		
	}
}
