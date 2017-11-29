package com.zjm.mybatis.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloServicCgLib implements MethodInterceptor {
	
	private Object target ;
	
	/**
	 * 创建代理对象
	 * @param target
	 * @return
	 */
	public Object getInstance(Object target){
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.err.println("####################我是CGLib的动态代理#############");
		System.err.println("我准备说Hello");
		Object returnObj = proxy.invokeSuper(obj, args);
		//反射方法的调用后
		System.err.println("我说过Hello了");
		return returnObj;
	}

}
