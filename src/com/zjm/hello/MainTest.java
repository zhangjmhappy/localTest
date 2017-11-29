package com.zjm.hello;

import java.util.concurrent.atomic.AtomicInteger;

public class MainTest {

	public static void main(String[] args) {
		AtomicInteger a = new AtomicInteger();
		int update = 1;
		int expect = update + 1;
		boolean flg = a.compareAndSet(update, expect);
		System.out.println(flg);

		a.incrementAndGet();

		// LinkedTransferQueue
		int result = f(5);
		System.out.println(result);
		
		System.out.println(f(0));

		System.out.println(2 << 3);
	}

	public static int f(int n) {

		//System.out.println(n+"=========");
		if (n >= 0 && n < 2) {
			return 1;
		}
		return f(n - 1) + f(n - 2);

	}

}
