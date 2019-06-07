package com.dyd.demo.thread;

class MyThread4 implements Runnable {
	private int ticket = 5;

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			synchronized (this) {
				if (ticket > 0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("车票卖出：ticket" + ticket--);
				}
			}
		}
	}
}

public class SyncDemo1 {

	public static void main(String[] args) {
		MyThread4 th = new MyThread4();
		Thread tr1 = new Thread(th);
		Thread tr2 = new Thread(th);
		Thread tr3 = new Thread(th);
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
