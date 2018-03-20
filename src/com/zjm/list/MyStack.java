package com.zjm.list;

import java.util.Stack;

public class MyStack {
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();
		
		myStack.push("jack");
		myStack.push("rose");
		myStack.push("bob");
		
		System.out.println(myStack.peek());
		System.out.println(myStack.size());
		myStack.pop();
		System.out.println(myStack.size());
	
	}
}
