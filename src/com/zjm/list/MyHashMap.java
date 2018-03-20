package com.zjm.list;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MyHashMap {

	static int count = 0;
	public static void main(String[] args) {
		HashMap<String,String> hashMap1 = new HashMap<>();
		
		
		Map<String,String> hashMap2 = Collections.synchronizedMap(hashMap1);
		
		long beginTime = System.nanoTime();
		
		for (int i = 0; i < 1000000; i++) {
			
		}
		
		long endTime = System.nanoTime();
		long costTime = endTime - beginTime;
		System.out.println(costTime);
		
		//ArrayBlockingQueue
		
		//AtomicInteger
		
		
		for (int i = 0; i < 5; i++) {
			 
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("threadName" + Thread.currentThread().getName() + " ===count:" + count++);
					
				}
			}).start();
		}
		
		AtomicInteger counter = new AtomicInteger();
		
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(counter.incrementAndGet());
					
				}
			}).start();
		}
		
	}
	
}
