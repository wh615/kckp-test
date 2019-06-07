package com.dyd.demo.string;

import java.util.StringTokenizer;

public class StringDemo1 {

	static int test() {
		int x = 1;
		try {
			return x;
		} finally {
			System.out.println("finally块执行:" + ++x);
		}
	}

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("this,is,a,test", ",");
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "\t");
		}
		System.out.println("===============");
		System.out.println(new StringDemo1().test());

	}
}
