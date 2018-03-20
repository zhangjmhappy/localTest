package com.zjm.multithread.myvolatile;

public class MyVolatileThread  extends Thread {

//	private volatile boolean isRunning = true;
	private  boolean isRunning = true;

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public static void main(String[] args) throws InterruptedException {
		MyVolatileThread vThread = new MyVolatileThread();
		vThread.start();
		Thread.sleep(3000);
		vThread.isRunning = false;
//		vThread.
		System.out.println("设置主线程isRunning为false");
		Thread.sleep(1000);
		System.out.println(vThread.isRunning );
		
	}

	@Override
	public void run() {
		System.out.println("进入run方法");
		while(isRunning){
			
		}
		System.out.println("线程停止");
	}

}
