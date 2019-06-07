package com.dyd.demo.thread;

class MyThread extends Thread{
	private String name;

	public MyThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name+"运行"+i+"次");
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("线程A");
		MyThread myThread2 = new MyThread("线程B");
		//myThread1.start();
		//myThread2.start();
		myThread1.run();
		myThread2.run();
		
	}
}
