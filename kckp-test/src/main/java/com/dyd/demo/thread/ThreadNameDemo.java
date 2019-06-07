package com.dyd.demo.thread;

class MyThread3 implements Runnable{
 
	private int ticket=5;
	@Override
	public void run() {
		for(int i=0;i<3;i++){
			if(ticket>0){
				
				System.out.println(Thread.currentThread().getName()+"剩余票数"+ticket--);
			}
		}
	}
	
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		Thread thread1 = new Thread(myThread3);
		Thread thread2 = new Thread(myThread3);
		Thread thread3 = new Thread(myThread3);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
