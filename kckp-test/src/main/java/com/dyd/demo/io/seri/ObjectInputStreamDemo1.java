package com.dyd.demo.io.seri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ops=new ObjectInputStream(
				new FileInputStream(new File("d:"+File.separator+"test.txt")));
		Object obj=ops.readObject();
		ops.close();
		System.out.println(obj);
	}
	
}
