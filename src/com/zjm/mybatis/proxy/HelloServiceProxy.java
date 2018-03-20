package com.zjm.mybatis.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy implements InvocationHandler {
	
	//真实对象
	private Object target;
	
	public Object bind(Object target){
		this.target = target;
		Object object = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		return object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.err.println(proxy.getClass().getName());
		System.err.println("##### #####我是JDK动态代理#############");
		Object result = null;
		//反射方法的调用前
		System.err.println("我准备说Hello");
		result = method.invoke(target, args);
		Thread.sleep(1000);
		//反射方法的调用后
		System.err.println("我说过Hello了");
		return result;
	}

}
