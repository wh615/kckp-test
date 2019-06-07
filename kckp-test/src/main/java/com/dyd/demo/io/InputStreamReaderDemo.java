package com.dyd.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


/**
 * 实现对输入流的字节流转换成字符流
 * @author caowanhe
 * @date 2017年3月28日 下午10:02:08
 */
public class InputStreamReaderDemo {

	
	public static void main(String[] args) throws IOException {
		File file=new File("d:"+File.separator+"test.txt");
		Reader re=new InputStreamReader(new FileInputStream(file));
		char[] c=new char[1024];
		int temp=0;
		int len=0;
		while((temp=re.read(c))!=-1){
			 len=temp;
		}
		re.close();
		
		System.out.println(new String(c,0,len));
	}
	
}
