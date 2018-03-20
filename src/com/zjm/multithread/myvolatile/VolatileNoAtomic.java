package com.zjm.multithread.myvolatile;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Volatile不能保证原子操作性，结果不为10000
 * @author Administrator
 *
 */
public class VolatileNoAtomic extends Thread {

	//Volatile不能保证原子操作性，结果不为10000
//	private static volatile int count;
	private static AtomicInteger count = new AtomicInteger(0);
	
	
	private static void addCount(){
		for (int i = 0; i < 1000; i++) {
//			count ++ ;
			count.incrementAndGet();
		}
		System.out.println(count);
	}

	@Override
	public void run() {
		addCount();
	}
	
	public static void main(String[] args) {
		VolatileNoAtomic[] arr = new VolatileNoAtomic[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = new VolatileNoAtomic();
		}
		
		for (int i = 0; i < 10; i++) {
			arr[i].start();
		}
	}
	
	
}
