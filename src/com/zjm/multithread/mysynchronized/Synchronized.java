package com.zjm.multithread.mysynchronized;

/**
 * 分析jps 
 * jstack 分析线程堆栈信息
 * @author Administrator
 *
 */
public class Synchronized {

	public static void main(String[] args) {
		synchronized (Synchronized.class) {
			
		}
		m();
	}
	
	public static synchronized void m(){
		
	}
}
