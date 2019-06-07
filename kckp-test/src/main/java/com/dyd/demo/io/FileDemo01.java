package com.dyd.demo.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo01 {

	public static void main(String[] args) {
		String path="d:"+File.separator+"test1.txt";
		File file=new File(path);
		try {
			if(file.exists()){
				boolean deletefile=file.delete();
				System.out.println("删除文件是否成功"+deletefile);
			}
			boolean createFile=file.createNewFile();
			System.out.println("创建文件是否成功"+createFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
