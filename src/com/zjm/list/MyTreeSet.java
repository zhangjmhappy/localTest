package com.zjm.list;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(100);
		treeSet.add(99);
		treeSet.add(50);
		treeSet.add(80);
		
		Iterator<Integer> iterator = treeSet.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("==============");
		for(Integer i : treeSet){
			System.out.println(i);
		}
		
	}
}
