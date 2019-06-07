package com.dyd.demo.clazz.timer;

import java.util.Timer;

public class TestTask {

	public static void main(String[] args) {
		// 定义定时器对象Timer
		Timer t = new Timer() ;	// 建立Timer类对象
		MyTask mytask = new MyTask() ;	// 定义任务
		t.schedule(mytask,1000,3000) ;	// 设置任务的执行，1秒后开始，每2秒重复
	
	}
}
