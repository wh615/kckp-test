package com.dyd.demo.thread;

class MyThread1 implements Runnable {
	private int ticket = 5;

	@Override
	public void run() {
			for (int i = 0; i < 100; i++) {
				if(ticket>0){
					System.out.println("剩余票数为："+ticket--);
					
				}
			}
		}
		
	}

public class MyThreadDemo3 {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread1);
		Thread thread3 = new Thread(myThread1);
		Thread thread4 = new Thread(myThread1);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
