package com.dyd.demo.oop;

class BaseClass{
	
	public int book=6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	public void test(){
		System.out.println("父类被覆盖的方法");
	}
}
public class SubClass extends BaseClass {
	public String book="疯狂软件系列图书";

	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
	
	public void sub(){
		
		System.out.println("子类普通的方法");
	}
	public static void main(String[] args) {
		
		BaseClass baseClass = new BaseClass();
		System.out.println(baseClass.book);
		baseClass.base();
		baseClass.test();
		
		SubClass subClass = new SubClass();
		System.out.println(subClass.book);
		subClass.base();
		subClass.test();
		
		BaseClass baseClass1=new SubClass();
		System.out.println(baseClass1.book);
		baseClass1.base();
		baseClass1.test();
		
		System.out.println("=============================");
		SubClass subClass1=(SubClass) new BaseClass();
		System.out.println(subClass1.book);
		subClass1.base();
		subClass1.test();
	}
}
