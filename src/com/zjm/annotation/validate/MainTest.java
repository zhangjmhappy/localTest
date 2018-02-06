package com.zjm.annotation.validate;

public class MainTest {

	public static void main(String[] args) {
		User user = new User();

		user.setName("jackson");
		user.setAge("999");

//		System.out.println(UserCheck.check(user));
		
		int a = 1;
		int b =a;
		a = 4;
		System.out.println(b);
	}
}
