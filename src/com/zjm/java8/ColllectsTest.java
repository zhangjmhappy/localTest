package com.zjm.java8;

import java.util.LinkedList;
import java.util.List;

public class ColllectsTest {

	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		
		names.add("apple");
		names.add("orange");
		names.add("banana");
		names.forEach(name -> System.out.println(name));
	}
}
