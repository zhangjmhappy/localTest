package com.zjm.threadpool.excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorService {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
//		new ThreadPoolExecutor
		for (int i = 0; i < 100; i++) {
			service.execute(new Runnable() {
				
				@Override
				public void run() {
					int i = 0;
					
					System.out.println(i++);
					
				}
			});
			
			service.shutdown();
		}
		
	}
}
