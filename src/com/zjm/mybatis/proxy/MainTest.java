package com.zjm.mybatis.proxy;

public class MainTest {
	public static void main(String[] args) {
		HelloServiceProxy helloHandler = new HelloServiceProxy();
		HelloService proxy = (HelloService)helloHandler.bind(new HelloServiceImpl());
		proxy.sayHello("Zhang san");
	}
}
