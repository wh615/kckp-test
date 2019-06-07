package com.dyd.demo.io;

import java.io.File;

public class FileDemo02 {

	public static void main(String[] args) {

		File file=new File("e:"+File.separator);
		print(file);
	}

	private static void print(File file) {
		
		if(file!=null){
			if(file.isDirectory()){
				File[] f=file.listFiles();
				if(f!=null){
					for(int i=0;i<f.length;i++){
						print(file);
					}
				}
			}else{
				System.out.println(file);
			}
		}
	}

}
