package com.zjm.mystatic;

public class StaticDemo {

	private static int x = 100;
	
	public static void main(String[] args) {
		StaticDemo.x++;
		System.out.println(StaticDemo.x);
		
		new StaticDemo().x--;
		new StaticDemo().x--;
		new StaticDemo().x--;
		System.out.println(StaticDemo.x);
		
	}
}
