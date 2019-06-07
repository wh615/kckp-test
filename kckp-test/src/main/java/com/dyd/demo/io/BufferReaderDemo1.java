package com.dyd.demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从键盘输入数据
 * @author caowanhe
 * @date 2017年3月29日 下午3:01:13
 */
public class BufferReaderDemo1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		System.out.println("请输入内容：");
		str=buf.readLine();
		System.out.println("你输入的内容为："+str);
	}
}
