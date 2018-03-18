package com.zjm.mywebservlet;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) throws Exception {
		//new SimpleHttpServer().start();

		List<Integer> intger = new ArrayList<Integer>();
		intger.add(1);
		intger.add(2);
		intger.add(3);
		intger.add(4);
		intger.add(5);
		intger.remove(0);
		intger.remove(0);
		intger.remove(1);
		for(Integer item : intger){
			System.out.println(item);
		}
	}
}
