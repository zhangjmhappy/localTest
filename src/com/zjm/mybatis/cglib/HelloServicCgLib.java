package com.zjm.mybatis.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloServicCgLib implements MethodInterceptor {
	
	private Object target ;
	
	/**
	 * �����������
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
		System.err.println("####################����CGLib�Ķ�̬����#############");
		System.err.println("��׼��˵Hello");
		Object returnObj = proxy.invokeSuper(obj, args);
		//���䷽���ĵ��ú�
		System.err.println("��˵��Hello��");
		return returnObj;
	}

}
