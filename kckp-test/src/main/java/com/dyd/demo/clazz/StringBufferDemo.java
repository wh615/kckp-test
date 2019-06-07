package com.dyd.demo.clazz;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer buf = new StringBuffer();
		buf.append("广州云顺通研发有限公司");
		fun(buf);
		System.out.println(buf);
	}

	private static void fun(StringBuffer s) {
           s.append("共创辉煌").append("研发快处快赔");
	}
}
