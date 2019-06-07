package com.dyd.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 实现对输出流字符流转换成字节流
 * @author caowanhe
 * @date 2017年3月28日 下午10:09:47
 */
public class OutPutStreamWriterDemo01 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("d:"+File.separator+"test.txt");
		
		Writer wri=new OutputStreamWriter(new FileOutputStream(file,true));
		
		String str="学习Java新技术,";
		wri.write(str);
		wri.close();
		
	}
}
