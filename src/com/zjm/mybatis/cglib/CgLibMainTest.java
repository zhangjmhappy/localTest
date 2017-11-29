package com.zjm.mybatis.cglib;

import com.zjm.mybatis.proxy.HelloService;
import com.zjm.mybatis.proxy.HelloServiceImpl;

public class CgLibMainTest {

	public static void main(String[] args) {
		HelloServicCgLib helloHandler = new HelloServicCgLib();
		HelloService proxy = (HelloService)helloHandler.getInstance(new HelloServiceImpl());
		proxy.sayHello("Zhang san");
	}
}
