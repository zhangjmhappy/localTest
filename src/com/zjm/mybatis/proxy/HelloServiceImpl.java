package com.zjm.mybatis.proxy;

public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " +name);
	}

}
