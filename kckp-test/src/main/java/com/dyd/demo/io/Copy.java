package com.dyd.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class Copy {

	public static void main(String[] args) throws IOException {
		if(args.length!=2){
			System.out.println("输入的参数不正确");
			System.exit(1);
		}
		File file1=new File(args[0]);
		File file2=new File(args[1]);
		
		if(!file1.exists()){
			System.out.println("源文件不存在");
			System.exit(1);
		}
		InputStream in=new FileInputStream(file1);
		OutputStream out=new FileOutputStream(file2);
		
		if(in!=null&&out!=null){
			int temp=0;
			while((temp=in.read())!=-1){
				out.write(temp);
			}
			in.close();
			out.close();
			System.out.println("复制完成");
		}
	}
}
