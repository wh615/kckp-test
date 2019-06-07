package com.dyd.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 实现对打印流的操作
 * @author caowanhe
 * @date 2017年3月29日 下午2:40:34
 */

public class PrintDemo1 {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps=
				new PrintStream(
						new FileOutputStream(
								new File("d:"+File.separator+"test.txt"),true));
		ps.println("Helloworld");
		ps.println("疯狂的程序员");
		ps.println("1+1="+2);
		ps.close();
	}
}
