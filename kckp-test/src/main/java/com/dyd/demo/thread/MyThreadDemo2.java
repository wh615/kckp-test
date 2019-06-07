package com.dyd.demo.thread;

class MyThread2 implements Runnable {

	private String name;

	public MyThread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "执行" + i + "次");
		}

	}
}

public class MyThreadDemo2 {

	public static void main(String[] args) {
		MyThread2 myThread1 = new MyThread2("A线程");
		//MyThread2 myThread2 = new MyThread2("B线程");
		
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread1);
		Thread thread3 = new Thread(myThread1);
		//Thread thread2 = new Thread(myThread2);
		//thread1.start();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
