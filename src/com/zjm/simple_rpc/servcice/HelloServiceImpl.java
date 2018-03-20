package com.zjm.simple_rpc.servcice;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String name) {
		return "hi," + name;
	}

}
