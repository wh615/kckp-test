package com.dyd.demo.clazz;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		StringBuffer buf=new StringBuffer();
		buf.append(false);
		buf.append(true);
		buf.append("Hello world").append("Java").append("JavaSE").append("\n").append(100);
		
		System.out.println(buf);
	}
}
