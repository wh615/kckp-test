package com.dyd.demo.io.seri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream ops=new ObjectOutputStream(
				new FileOutputStream(new File("d:"+File.separator+"test.txt")));
		ops.writeObject(new Person("zhangsan",18));
		ops.close();
	}
}
