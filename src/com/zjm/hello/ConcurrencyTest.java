package com.zjm.hello;

public class ConcurrencyTest {

	private static final long count = 100000001L;
	
	public static void main(String[] args) throws InterruptedException {
		concurreny();
		 serial();
	}
	
	public static void concurreny() throws InterruptedException {
		long start = System.currentTimeMillis();
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int a = 0;
				for (int i = 0; i < count; i++) {
					a += 5;
				}
			}
		});
		
		thread.start();
		
		int b = 0;
		for (int i = 0; i < count; i++) {
			b--;
		}
		thread.join();
		long time =  System.currentTimeMillis() - start;
		
		System.out.println("concurrency :" + time + "ms, b=" + b);
	}
	
	public static void  serial(){
		long start = System.currentTimeMillis();
		int a = 0;
		for (int i = 0; i < count; i++) {
			a += 5;
		}
		
		int b = 0;
		for (int i = 0; i < count; i++) {
			b--;
		}
		
		long time =  System.currentTimeMillis() - start;
		System.out.println("serial :" + time + "ms, b=" + b);
	}
}
