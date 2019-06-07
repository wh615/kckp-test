package com.dyd.demo.clazz;

public class StirngBufferDemo4 {

	public static void main(String[] args) {
		StringBuffer buf=new StringBuffer();
		
		buf.append("广州云顺通研发有限公司");
		String str=buf.reverse().toString();
		System.out.println(str);
		
		
		
	}
}
