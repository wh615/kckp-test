package com.dyd.demo.io.seri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 实现对象数组的序列化
 * @author caowanhe
 * @date 2017年3月29日 下午4:27:47
 */
public class SerDemo5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person[] per={new Person("zhangsan",18),
				new Person("lisi",18),new Person("wangwu",18),new Person("李章",18),};
		ser(per);
		Object[] obj=(Object[]) dser();
		for (Object object : obj) {
			System.out.println("传输对象"+object);
		}
	}

	private static Object dser() throws FileNotFoundException, IOException, ClassNotFoundException {
	
		ObjectInputStream ois=new ObjectInputStream(
				new FileInputStream(new File("d:"+File.separator+"test.txt")));
		Object[] obj=(Object[]) ois.readObject();
		return obj;
	}

	private static void ser(Person[] per) throws IOException {
		
		ObjectOutputStream opt=new ObjectOutputStream(
				new FileOutputStream(new File("d:"+File.separator+"test.txt")));
		opt.writeObject(per);
		opt.close();
	}
}
