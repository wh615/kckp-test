package com.dyd.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 格式化输出打印流
 * @author caowanhe
 * @date 2017年3月29日 下午2:45:39
 */
public class PrintDemo2 {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream ps=
				new PrintStream(
						new FileOutputStream(
								new File("d:"+File.separator+"test.txt"),true));
		
		String name="曹万合";
		int age=18;
		float score=100.356f;
		char sex ='男';
		ps.printf("姓名：%s;年龄：%d;分数：%f;性别：%c",name,age,score,sex);
	}
}
