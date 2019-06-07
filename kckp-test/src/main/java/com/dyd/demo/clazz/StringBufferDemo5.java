package com.dyd.demo.clazz;

public class StringBufferDemo5 {

	public static void main(String[] args) {
		
		StringBuffer buf=new StringBuffer();
		buf.append("Hello ").append("world");
		buf.replace(6,11,"LiXingHua");
		String str=buf.substring(6, 10);
		System.out.println("内容替换之后的结果 是："+buf);
		System.out.println(str);
	}
}
