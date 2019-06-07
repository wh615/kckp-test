package com.dyd.demo.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流实现线程之间的通信操作操作
 * 
 * @author caowanhe
 * @date 2017年3月28日 下午10:21:35
 */
class Send implements Runnable {

	private PipedOutputStream pos = null;

	public Send() {
		this.pos = new PipedOutputStream();
	}

	@Override
	public void run() {
		String str = "HelloWorld";
		try {
			this.pos.write(str.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.pos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PipedOutputStream getPos() {
		return pos;
	}

}

class Recevie implements Runnable {

	private PipedInputStream pio = null;

	public Recevie() {
		this.pio = new PipedInputStream();
	}

	@Override
	public void run() {

		byte[] by = new byte[1024];
		int len = 0;
		try {
			len = this.pio.read(by);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.pio.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("接收的内容为："+new String(by,0,len));
	}

	public PipedInputStream getPis(){
		return pio;
	}
}

public class PipedDemo {

	public static void main(String[] args) throws IOException {
		Send send=new Send();
		Recevie recevie=new Recevie();
		send.getPos().connect(recevie.getPis());
		new Thread(send).start();
		new Thread(recevie).start();
	}
	
}
