package com.dyd.demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 通过BufferReader实现对两个数字的相加
 * 
 * @author caowanhe
 * @date 2017年3月29日 下午3:05:21
 */
public class BufferReaderDemo2 {

	public static void main(String[] args) throws IOException {
		while (true) {

			// 定义两个变量实现对两个数字的存储
			int a;
			int b;
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

			String str = null;
			System.out.print("请输入第一个数字：");
			str = buf.readLine();
			a = Integer.valueOf(str);

			System.out.print("请输入第二个数字：");
			str = buf.readLine();
			b = Integer.valueOf(str);

			System.out.println("两个数字相加之和为：" + (a + b));
		}
	}
}
