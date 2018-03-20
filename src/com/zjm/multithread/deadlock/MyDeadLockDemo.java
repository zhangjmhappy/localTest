package com.zjm.multithread.deadlock;

public class MyDeadLockDemo extends Thread {

	
	private Counter counter;
	
	public MyDeadLockDemo(Counter counter){
		this.counter = counter;
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.add();
		}
	}
	
	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		counter1.setFriend(counter2);
//		counter1.setName("counter1");
		counter2.setFriend(counter1);
//		counter2.setName("counter2");
		new MyDeadLockDemo(counter1).start();
		new MyDeadLockDemo(counter2).start();
	}
	
	
	
	
	
}

class Counter{
	private int a ;
	private String name;
	private Counter friend;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setFriend(Counter friend){
		this.friend = friend;
	}
	
	public synchronized void add(){
		System.out.println(Thread.currentThread().getName() + ":add====\t" + a);
		a++;
//		try {
//			wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Thread.yield();
		
		friend.delete();
		System.out.println(Thread.currentThread().getName() + ":add\t" + a);
	}

	public synchronized void delete() {
		a--;
//		notify();
		System.out.println(Thread.currentThread().getName() + ":delete \t" + a);
	}
}
