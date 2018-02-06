package com.zjm.annotation;

import java.lang.reflect.InvocationTargetException;

public class MainTest {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		User user = UserFactory.create();
		System.out.println(user);
	}
}
