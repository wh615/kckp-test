package com.dyd.demo.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * ByteArrayInputStreamDemo内存输入流对象实现对内存文件的操作
 * @author caowanhe
 * @date 2017年3月28日 下午10:12:48
 */
public class ByteArrayInputStreamDemo1 {

	public static void main(String[] args) {
		String str="疯狂学习java，向高级java程序员迈进";
		ByteArrayInputStream bis=null;
		ByteArrayOutputStream bou=null;
		bis=new ByteArrayInputStream(str.getBytes());
		bou=new ByteArrayOutputStream();
		int temp=0;
		while((temp=bis.read())!=-1){
			char c=(char) temp;
			bou.write(c);
		}
		String newStr=bou.toString();
		try {
			bis.close();
			bou.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(newStr);
	}
}
